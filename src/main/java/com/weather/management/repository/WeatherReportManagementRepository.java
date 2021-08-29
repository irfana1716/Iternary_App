package com.weather.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weather.management.entity.Iternary;
import java.lang.String;
import java.util.List;

@Repository
public interface WeatherReportManagementRepository extends JpaRepository<Iternary, Integer> {
	
	List<Iternary> findByCityName(String cityname);
	
	List<Iternary> findByIternaryName(String iternaryname);
	
}
