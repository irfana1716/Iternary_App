package com.weather.management.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.weather.management.entity.Iternary;
import com.weather.management.model.WeatherReportModel;
import com.weather.management.repository.WeatherReportManagementRepository;
import com.weather.management.service.WeatherReportManagementService;

@Service
public class WeatherReportManagementServiceImpl implements WeatherReportManagementService {

	@Autowired
	private WeatherReportManagementRepository weatherReportManagementRepository;

	@Override
	public Response addWeatherReportData(List<WeatherReportModel> weatherReportModelList) {

		weatherReportModelList.stream().forEach(weatherReportModel -> {
			
			Iternary entity = new Iternary();
			
			BeanUtils.copyProperties(weatherReportModel, entity);

			entity = weatherReportManagementRepository.save(entity);

		});

		return Response.status(Status.CREATED).build();
	}

	@Override
	public ResponseEntity<List<WeatherReportModel>> showWeatherReportData(String city_name) {

		HttpStatus statusCode = HttpStatus.NO_CONTENT;
		
		List<WeatherReportModel> weatherReportModelList = new ArrayList<WeatherReportModel>();

		weatherReportModelList = weatherReportManagementRepository.findByCityName(city_name).stream()
				.map(model -> new WeatherReportModel(model.getCityName(), model.getIternaryName(), model.getCountryCode(), model.getTemperature(),
						model.getClouds(), model.getDateTime()))
				.collect(Collectors.toList());
		
		if (Optional.of(weatherReportModelList).isPresent()) {
			
			statusCode = HttpStatus.OK;
			
		}

		return new ResponseEntity<>(weatherReportModelList, statusCode);
	}

	@Override
	public Response addIternary(String city_name, String iternary_name) {

		List<WeatherReportModel> weatherReportModelList = showWeatherReportData(city_name).getBody();
		
		weatherReportModelList.stream().forEach(weatherReportModel -> {
			
			Iternary entity = new Iternary();
			
			BeanUtils.copyProperties(weatherReportModel, entity);

			entity.setIternaryName(iternary_name);
			
			entity = weatherReportManagementRepository.saveAndFlush(entity);

		});

		return Response.status(Status.CREATED).build();
	}

	@Override
	public ResponseEntity<List<WeatherReportModel>> getIternary(String iternary_name) {
		HttpStatus statusCode = HttpStatus.NO_CONTENT;
		
		List<WeatherReportModel> weatherReportModelList = new ArrayList<WeatherReportModel>();

		weatherReportModelList = weatherReportManagementRepository.findByIternaryName(iternary_name).stream()
				.map(model -> new WeatherReportModel(model.getCityName(), model.getIternaryName(), model.getCountryCode(), model.getTemperature(),
						model.getClouds(), model.getDateTime()))
				.collect(Collectors.toList());
		
		if (Optional.of(weatherReportModelList).isPresent()) {
			
			statusCode = HttpStatus.OK;
			
		}
		return new ResponseEntity<>(weatherReportModelList, statusCode);
	}

}
