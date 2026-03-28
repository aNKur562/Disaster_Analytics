package com.crisisconnect.disastermanagement.dto;

import java.math.BigDecimal;

public class EconomicImpactDTO {
	 private String disasterType;
	    private BigDecimal avgDamageUsd;
	    private BigDecimal totalDamageUsd;
	    private Long disasterCount;
		public String getDisasterType() {
			return disasterType;
		}
		public void setDisasterType(String disasterType) {
			this.disasterType = disasterType;
		}
		public BigDecimal getAvgDamageUsd() {
			return avgDamageUsd;
		}
		public void setAvgDamageUsd(BigDecimal avgDamageUsd) {
			this.avgDamageUsd = avgDamageUsd;
		}
		public BigDecimal getTotalDamageUsd() {
			return totalDamageUsd;
		}
		public void setTotalDamageUsd(BigDecimal totalDamageUsd) {
			this.totalDamageUsd = totalDamageUsd;
		}
		public Long getDisasterCount() {
			return disasterCount;
		}
		public void setDisasterCount(Long disasterCount) {
			this.disasterCount = disasterCount;
		}

}
