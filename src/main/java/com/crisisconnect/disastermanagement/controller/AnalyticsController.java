package com.crisisconnect.disastermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisisconnect.disastermanagement.dto.EconomicImpactDTO;
import com.crisisconnect.disastermanagement.dto.SeasonalPatternDTO;
import com.crisisconnect.disastermanagement.dto.TimeTrendDTO;
import com.crisisconnect.disastermanagement.service.AnalyticsService;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
    
    @Autowired
    private AnalyticsService analyticsService;
    
    
    @GetMapping("/yearly-trends")
    public List<TimeTrendDTO> getYearlyTrends() {
        return analyticsService.getYearlyTrends();
    }
    
    
    @GetMapping("/economic-impact")
    public List<EconomicImpactDTO> getEconomicImpact() {
        return analyticsService.getEconomicImpactByType();
    }
    
    @GetMapping("/seasonal-patterns")
    public List<SeasonalPatternDTO> getSeasonalPatterns() {
        return analyticsService.getSeasonalPatterns();
    }
    
    
    @GetMapping("/deadliest-countries")
    public List<Object[]> getDeadliestCountries() {
        return analyticsService.getDeadliestCountries();
    }
    
    
    @GetMapping("/decade-trends")
    public List<Object[]> getDecadeTrends() {
        return analyticsService.getDecadeTrends();
    }
}
