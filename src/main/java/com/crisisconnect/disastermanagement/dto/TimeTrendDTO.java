package com.crisisconnect.disastermanagement.dto;

public class TimeTrendDTO {
	 private Integer year;
	    private Long disasterCount;
	    private Integer totalDeaths;
		public Integer getYear() {
			return year;
		}
		public void setYear(Integer year) {
			this.year = year;
		}
		public Long getDisasterCount() {
			return disasterCount;
		}
		public void setDisasterCount(Long disasterCount) {
			this.disasterCount = disasterCount;
		}
		public Integer getTotalDeaths() {
			return totalDeaths;
		}
		public void setTotalDeaths(Integer totalDeaths) {
			this.totalDeaths = totalDeaths;
		}

}
