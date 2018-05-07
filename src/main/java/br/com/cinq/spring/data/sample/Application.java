package br.com.cinq.spring.data.sample;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.Country;
import br.com.cinq.spring.data.sample.repository.CityRepository;
import br.com.cinq.spring.data.sample.repository.CountryRepository;

@SpringBootApplication
public class Application {

	@Autowired
	CountryRepository countryRepository;

	@Autowired
	CityRepository cityRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	void onStartup() {

		Country brazil = new Country(1, "Brazil");
		Country us = new Country(2, "United States");
		Country france = new Country(3, "France");

		if (countryRepository.findById(1) == null)
			countryRepository.save(brazil);
		if (countryRepository.findById(2) == null)
			countryRepository.save(us);
		if (countryRepository.findById(3) == null)
			countryRepository.save(france);

		List<City> cities = new ArrayList<>();

		cities.add(new City("Curitiba", brazil));
		cities.add(new City("Rio de Janeiro", brazil));
		cities.add(new City("Manaus", brazil));
		cities.add(new City("Fortaleza", brazil));

		cities.add(new City("New York", us));
		cities.add(new City("Los Angeles", us));
		cities.add(new City("Atlanta", us));

		cities.add(new City("Paris", france));
		cities.add(new City("Lyon", france));

		for (City c : cities) {
			cityRepository.save(c);
		}

	}

}
