package com.crisisconnect.disastermanagement.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crisisconnect.disastermanagement.dto.EconomicImpactDTO;
import com.crisisconnect.disastermanagement.dto.SeasonalPatternDTO;
import com.crisisconnect.disastermanagement.dto.TimeTrendDTO;
import com.crisisconnect.disastermanagement.repository.DisasterRepo;

@Service
public class AnalyticsService {
    
    @Autowired
    private DisasterRepo disasterRepo;
    
    
    public List<TimeTrendDTO> getYearlyTrends() {
        List<Object[]> results = disasterRepo.getYearlyTrends();
        List<TimeTrendDTO> trends = new ArrayList<>();
        
        for (Object[] row : results) {
            TimeTrendDTO dto = new TimeTrendDTO();
            dto.setYear(((Number) row[0]).intValue());
            dto.setDisasterCount(((Number) row[1]).longValue());
            dto.setTotalDeaths(((Number) row[2]).intValue());
            trends.add(dto);
        }
        return trends;
    }
    

    public List<EconomicImpactDTO> getEconomicImpactByType() {
        List<Object[]> results = disasterRepo.getEconomicImpactByType();
        List<EconomicImpactDTO> impacts = new ArrayList<>();
        
        for (Object[] row : results) {
            EconomicImpactDTO dto = new EconomicImpactDTO();
            dto.setDisasterType((String) row[0]);
            dto.setAvgDamageUsd((BigDecimal) row[1]);
            dto.setTotalDamageUsd((BigDecimal) row[2]);
            dto.setDisasterCount(((Number) row[3]).longValue());
            impacts.add(dto);
        }
        return impacts;
    }
    
   
    public List<SeasonalPatternDTO> getSeasonalPatterns() {
        List<Object[]> results = disasterRepo.getSeasonalPatterns();
        List<SeasonalPatternDTO> patterns = new ArrayList<>();
        
        for (Object[] row : results) {
            SeasonalPatternDTO dto = new SeasonalPatternDTO();
            dto.setMonth(((Number) row[0]).intValue());
            dto.setDisasterType((String) row[1]);
            dto.setFrequency(((Number) row[2]).longValue());
            patterns.add(dto);
        }
        return patterns;
    }
    
   
    public List<Object[]> getDeadliestCountries() {
        return disasterRepo.getDeadliestCountries();
    }
    
    public List<Object[]> getDecadeTrends() {
        return disasterRepo.getDecadeTrends();
    }
}
