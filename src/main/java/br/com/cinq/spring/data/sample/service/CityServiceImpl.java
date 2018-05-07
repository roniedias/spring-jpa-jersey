package br.com.cinq.spring.data.sample.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	public List<City> getCitesByCountryName(String countryName) {

		return cityRepository.findAll().stream()
				.filter(city -> city.getCountry().getName().toLowerCase().contains(countryName.toLowerCase()))
				.collect(Collectors.toList());

	}

}
