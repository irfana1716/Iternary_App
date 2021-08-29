package com.weather.management.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.weather.management.model.WeatherReportModel;

@Service
public interface WeatherReportManagementService {
	
	public Response addWeatherReportData(List<WeatherReportModel> weatherReportModel);
	
	public ResponseEntity<List<WeatherReportModel>> showWeatherReportData(String city_name);
	
	public Response addIternary(String city_name, String iternary_name);
	
	public ResponseEntity<List<WeatherReportModel>> getIternary(String iternary_name);
}
