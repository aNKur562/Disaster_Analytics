package com.crisisconnect.disastermanagement.dto;

import java.math.BigDecimal;

public class DisasterResponseDTO {
	  private Integer id;
	    private String disasterType;
	    private String country;
	    private Integer startYear;
	    private Integer totalDeaths;
	    private BigDecimal totalDamageUsd;
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
