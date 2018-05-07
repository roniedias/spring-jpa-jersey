package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.Country;

public interface CityRepository extends CrudRepository<City, Integer> {

	List<City> findAll();

	List<City> findByCountry(Country country);
}
