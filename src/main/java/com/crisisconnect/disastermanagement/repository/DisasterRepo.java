package com.crisisconnect.disastermanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.crisisconnect.disastermanagement.entity.DisasterEntity;

public interface DisasterRepo extends JpaRepository<DisasterEntity, Integer> {
    
    // Existing queries (you already have these)
    List<DisasterEntity> findByCountry(String country);
    List<DisasterEntity> findByDisasterType(String disasterType);
    List<DisasterEntity> findByTotalDeathsGreaterThan(Integer minDeath);
    
    @Query(value = "SELECT * FROM disasters WHERE total_deaths > 0 ORDER BY total_deaths DESC LIMIT 10", nativeQuery = true)
    List<DisasterEntity> findTop10Deadliest();
    
    @Query(value = "SELECT disaster_type, COUNT(*) FROM disasters GROUP BY disaster_type ORDER BY COUNT(*) DESC", nativeQuery = true)
    List<Object[]> countByDisasterType();
    
    // NEW QUERIES FOR ANALYTICS
    
    // 1. Time Trends: Yearly disaster counts and deaths
    @Query(value = "SELECT start_year, COUNT(*), COALESCE(SUM(total_deaths), 0) " +
                   "FROM disasters " +
                   "WHERE start_year IS NOT NULL " +
                   "GROUP BY start_year " +
                   "ORDER BY start_year", nativeQuery = true)
    List<Object[]> getYearlyTrends();
    
    // 2. Economic Impact: Average and total damage by disaster type
    @Query(value = "SELECT disaster_type, " +
                   "AVG(total_damage_usd), " +
                   "SUM(total_damage_usd), " +
                   "COUNT(*) " +
                   "FROM disasters " +
                   "WHERE total_damage_usd > 0 " +
                   "GROUP BY disaster_type " +
                   "ORDER BY SUM(total_damage_usd) DESC", nativeQuery = true)
    List<Object[]> getEconomicImpactByType();
    
    // 3. Seasonal Patterns: Disaster frequency by month
    @Query(value = "SELECT start_month, disaster_type, COUNT(*) " +
            "FROM disasters " +
            "WHERE start_month IS NOT NULL AND start_month BETWEEN 1 AND 12 " +
            "GROUP BY start_month, disaster_type " +
            "ORDER BY start_month, COUNT(*) DESC", nativeQuery = true)
    List<Object[]> getSeasonalPatterns();
    // 4. Deadliest Countries: Top 10 countries by total deaths
    @Query(value = "SELECT country, SUM(total_deaths) as total_deaths " +
                   "FROM disasters " +
                   "WHERE total_deaths > 0 " +
                   "GROUP BY country " +
                   "ORDER BY total_deaths DESC " +
                   "LIMIT 10", nativeQuery = true)
    List<Object[]> getDeadliestCountries();
    
    // 5. Decade Comparison: Economic trends by decade
    @Query(value = "SELECT (start_year/10)*10 as decade, " +
                   "AVG(total_damage_adjusted_usd), " +
                   "SUM(total_damage_adjusted_usd), " +
                   "COUNT(*) " +
                   "FROM disasters " +
                   "WHERE start_year IS NOT NULL " +
                   "GROUP BY decade " +
                   "ORDER BY decade", nativeQuery = true)
    List<Object[]> getDecadeTrends();
}