package com.crisisconnect.disastermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crisisconnect.disastermanagement.dto.DisasterResponseDTO;
import com.crisisconnect.disastermanagement.service.DisasterService;

@RestController
@RequestMapping("/api/disasters")
public class DisasterController {
    
    @Autowired
    private DisasterService disasterService;
    
    @GetMapping
    public List<DisasterResponseDTO> getAllDisasters() {
        return disasterService.getAllDisasters();
    }
    
    @GetMapping("/country/{country}")
    public List<DisasterResponseDTO> getByCountry(@PathVariable String country) {
        return disasterService.getDisastersByCountry(country);
    }
    
    @GetMapping("/type/{type}")
    public List<DisasterResponseDTO> getByType(@PathVariable String type) {
        return disasterService.getDisastersByType(type);
    }
    
    @GetMapping("/deadliest")
    public List<DisasterResponseDTO> getDeadliest() {
        return disasterService.getDeadliestDisasters();
    }
    
    @GetMapping("/stats/types")
    public List<Object[]> getTypeStats() {
        return disasterService.getDisasterTypeCounts();
    }
    
    @GetMapping("/paginated")
    public Page<DisasterResponseDTO> getPaginatedDisasters(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "50") int size) {
        return disasterService.getDisastersPaginated(page, size);
    }
}