package com.crisisconnect.disastermanagement.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.crisisconnect.disastermanagement.dto.DisasterResponseDTO;
import com.crisisconnect.disastermanagement.entity.DisasterEntity;
import com.crisisconnect.disastermanagement.repository.DisasterRepo;

@Service
public class DisasterService {
    @Autowired
    private DisasterRepo disasterRepo;
    
    public List<DisasterResponseDTO> getAllDisasters(){
        return disasterRepo.findAll().stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }
    
    private DisasterResponseDTO convertToResponse(DisasterEntity disaster) {
        DisasterResponseDTO response = new DisasterResponseDTO();
        response.setId(disaster.getId());
        response.setDisasterType(disaster.getDisasterType());
        response.setCountry(disaster.getCountry());
        response.setStartYear(disaster.getStartYear());
        response.setTotalDeaths(disaster.getTotalDeaths());
        response.setTotalDamageUsd(disaster.getTotalDamageUsd());
        return response;
    }
    
    public List<DisasterResponseDTO> getDisastersByCountry(String country) {
        return disasterRepo.findByCountry(country).stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    public List<DisasterResponseDTO> getDisastersByType(String type) {
        return disasterRepo.findByDisasterType(type).stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    public List<DisasterResponseDTO> getDeadliestDisasters() {
        return disasterRepo.findTop10Deadliest().stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    public List<Object[]> getDisasterTypeCounts() {
        return disasterRepo.countByDisasterType();
    }
    
    // Paginated method
    public Page<DisasterResponseDTO> getDisastersPaginated(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<DisasterEntity> entityPage = disasterRepo.findAll(pageable);
        return entityPage.map(this::convertToResponse);
    }
}