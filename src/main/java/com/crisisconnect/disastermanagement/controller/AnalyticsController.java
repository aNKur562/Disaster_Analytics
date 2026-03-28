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
    
    // 1. Yearly trends: disaster count and deaths by year
    @GetMapping("/yearly-trends")
    public List<TimeTrendDTO> getYearlyTrends() {
        return analyticsService.getYearlyTrends();
    }
    
    // 2. Economic impact: average and total damage by disaster type
    @GetMapping("/economic-impact")
    public List<EconomicImpactDTO> getEconomicImpact() {
        return analyticsService.getEconomicImpactByType();
    }
    
    // 3. Seasonal patterns: disaster frequency by month and type
    @GetMapping("/seasonal-patterns")
    public List<SeasonalPatternDTO> getSeasonalPatterns() {
        return analyticsService.getSeasonalPatterns();
    }
    
    // 4. Deadliest countries: top 10 countries by deaths
    @GetMapping("/deadliest-countries")
    public List<Object[]> getDeadliestCountries() {
        return analyticsService.getDeadliestCountries();
    }
    
    // 5. Decade trends: economic trends by decade
    @GetMapping("/decade-trends")
    public List<Object[]> getDecadeTrends() {
        return analyticsService.getDecadeTrends();
    }
}