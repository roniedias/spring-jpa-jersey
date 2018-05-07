package br.com.cinq.spring.data.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cinq.spring.data.sample.entity.City;

@Service
public interface CityService {
	List<City> getCitesByCountryName(String countryName);
}
