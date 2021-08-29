package com.weather.management.controller;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.management.model.WeatherReportModel;
import com.weather.management.service.WeatherReportManagementService;


@CrossOrigin("*")
@RestController
@RequestMapping("/planner")
public class WeatherReportManagementController {
	
	
	@Autowired
	private WeatherReportManagementService weatherReportManagementService;
	
	@PostMapping("/add/report")
	public Response addWeatherReportData(@RequestBody List<WeatherReportModel> weatherReportModelList)
	{
		return weatherReportManagementService.addWeatherReportData(weatherReportModelList);
	}
	
	@GetMapping("/show/city/{city_name}")
	public ResponseEntity<List<WeatherReportModel>> showWeatherReportData(@PathVariable("city_name") String cityName)
	{
		return weatherReportManagementService.showWeatherReportData(cityName);
	}

	@PostMapping("/add/iternary/{iternary_name}/city/{city_name}")
	public Response addIternary(@PathVariable("city_name") String cityName, @PathVariable("iternary_name")String iternaryName) {
		
		return weatherReportManagementService.addIternary(cityName, iternaryName);
		
	}
	
	@GetMapping("/show/iternary/{iternary_name}")
	public ResponseEntity<List<WeatherReportModel>> getIternary(String iternaryName) {
		
		return weatherReportManagementService.getIternary(iternaryName);
		
	}
	
}
