package com.crisisconnect.disastermanagement.dto;

public class SeasonalPatternDTO {
	private Integer month;
    private String monthName;
    private String disasterType;
    private Long frequency;
    
    
    
    private String getMonthName(int month) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return months[month - 1];
    }
    public void setMonth(Integer month) {
		this.month = month;
		this.monthName = getMonthName(month); 
	}
	public Integer getMonth() {
		return month;
	}
	
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public String getDisasterType() {
		return disasterType;
	}
	public void setDisasterType(String disasterType) {
		this.disasterType = disasterType;
	}
	public Long getFrequency() {
		return frequency;
	}
	public void setFrequency(Long frequency) {
		this.frequency = frequency;
	}

}
