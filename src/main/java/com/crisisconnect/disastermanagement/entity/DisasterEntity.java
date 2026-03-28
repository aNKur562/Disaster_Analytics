package com.crisisconnect.disastermanagement.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="disasters")
public class DisasterEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	 @Column(name = "disno", length = 50)
	 private String disno;
	 
	 @Column(name = "historic", length = 10)
	    private String historic;
	    
	    @Column(name = "classification_key", length = 100)
	    private String classificationKey;
	    
	    @Column(name = "disaster_group", length = 100)
	    private String disasterGroup;
	    
	    @Column(name = "disaster_subgroup", length = 100)
	    private String disasterSubgroup;
	    
	    @Column(name = "disaster_type", length = 100)
	    private String disasterType;
	    
	    @Column(name = "disaster_subtype", length = 100)
	    private String disasterSubtype;
	    
	    @Column(name = "external_ids", columnDefinition = "text")
	    private String externalIds;
	    
	    @Column(name = "event_name", columnDefinition = "text")
	    private String eventName;
	    
	    @Column(name = "iso", length = 10)
	    private String iso;
	    
	    @Column(name = "country", length = 100)
	    private String country;
	    
	    @Column(name = "subregion", length = 100)
	    private String subregion;
	    
	    @Column(name = "region", length = 100)
	    private String region;
	    
	    @Column(name = "location", columnDefinition = "text")
	    private String location;
	    
	    @Column(name = "origin", columnDefinition = "text")
	    private String origin;
	    
	    @Column(name = "associated_types", columnDefinition = "text")
	    private String associatedTypes;
	    
	    @Column(name = "ofda_bha_response", length = 10)
	    private String ofdaBhaResponse;
	    
	    @Column(name = "appeal", length = 10)
	    private String appeal;
	    
	    @Column(name = "declaration", length = 10)
	    private String declaration;
	    
	    
	    @Column(name = "aid_contribution_usd")
	    private BigDecimal aidContribution;
	    
	    @Column(name = "magnitude")
	    private BigDecimal magnitude;
	    
	    @Column(name = "magnitude_scale", length = 50)
	    private String magnitudeScale;
	    
	    @Column(name = "latitude")
	    private BigDecimal latitude;
	    
	    @Column(name = "longitude")
	    private BigDecimal longitude;
	    
	    @Column(name = "river_basin", columnDefinition = "text")
	    private String riverBasin;
	    
	    @Column(name = "start_year")
	    private Integer startYear;
	    
	    @Column(name = "start_month")
	    private Integer startMonth;
	    
	    @Column(name = "start_day")
	    private Integer startDay;
	    
	    @Column(name = "end_year")
	    private Integer endYear;
	    
	    @Column(name = "end_month")
	    private Integer endMonth;
	    
	    @Column(name = "end_day")
	    private Integer endDay;
	    
	    @Column(name = "total_deaths")
	    private Integer totalDeaths;
	    
	    @Column(name = "no_injured")
	    private Integer noInjured;
	    
	    @Column(name = "no_affected")
	    private Integer noAffected;
	    
	    @Column(name = "no_homeless")
	    private Integer noHomeless;
	    
	    @Column(name = "total_affected")
	    private Integer totalAffected;
	    
	    @Column(name = "reconstruction_costs_usd")
	    private BigDecimal reconstructionCostsUsd;
	    
	    @Column(name = "reconstruction_costs_adjusted_usd")
	    private BigDecimal reconstructionCostsAdjustedUsd;
	    
	    @Column(name = "insured_damage_usd")
	    private BigDecimal insuredDamageUsd;
	    
	    @Column(name = "insured_damage_adjusted_usd")
	    private BigDecimal insuredDamageAdjustedUsd;
	    
	    @Column(name = "total_damage_usd")
	    private BigDecimal totalDamageUsd;
	    
	    @Column(name = "total_damage_adjusted_usd")
	    private BigDecimal totalDamageAdjustedUsd;
	    
	    @Column(name = "cpi")
	    private BigDecimal cpi;
	    
	    @Column(name = "admin_units", columnDefinition = "text")
	    private String adminUnits;

		@Column(name = "gadm_admin_units", columnDefinition = "text")
	    private String gadmAdminUnits;
	    
	    @Column(name = "entry_date")
	    private LocalDate entryDate;
	    
	    @Column(name = "last_update")
	    private LocalDate lastUpdate;
	    
	    @Column(name = "created_at")
	    private LocalDateTime createdAt;
	    
	    public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getDisasterType() {
			return disasterType;
		}

		public void setDisasterType(String disasterType) {
			this.disasterType = disasterType;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public Integer getStartYear() {
			return startYear;
		}

		public void setStartYear(Integer startYear) {
			this.startYear = startYear;
		}

		public Integer getTotalDeaths() {
			return totalDeaths;
		}

		public void setTotalDeaths(Integer totalDeaths) {
			this.totalDeaths = totalDeaths;
		}

		public BigDecimal getTotalDamageUsd() {
			return totalDamageUsd;
		}

		public void setTotalDamageUsd(BigDecimal totalDamageUsd) {
			this.totalDamageUsd = totalDamageUsd;
		}
	

}
