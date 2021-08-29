package com.weather.management.model;

public class WeatherReportModel {
	
	private String cityName;
	private String iternaryName;
	private String countryCode;
	private String temperature;
	private String clouds;
	private String dateTime;
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the iternaryName
	 */
	public String getIternaryName() {
		return iternaryName;
	}
	/**
	 * @param iternaryName the iternaryName to set
	 */
	public void setIternaryName(String iternaryName) {
		this.iternaryName = iternaryName;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the temperature
	 */
	public String getTemperature() {
		return temperature;
	}
	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	/**
	 * @return the clouds
	 */
	public String getClouds() {
		return clouds;
	}
	/**
	 * @param clouds the clouds to set
	 */
	public void setClouds(String clouds) {
		this.clouds = clouds;
	}
	/**
	 * @return the dateTime
	 */
	public String getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public WeatherReportModel(String cityName, String iternaryName, String countryCode, String temperature,
			String clouds, String dateTime) {
		super();
		this.cityName = cityName;
		this.iternaryName = iternaryName;
		this.countryCode = countryCode;
		this.temperature = temperature;
		this.clouds = clouds;
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "WeatherReportModel [cityName=" + cityName + ", iternaryName=" + iternaryName + ", countryCode="
				+ countryCode + ", temperature=" + temperature + ", clouds=" + clouds + ", dateTime=" + dateTime + "]";
	}
	
}
