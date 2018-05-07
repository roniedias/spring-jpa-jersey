package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.cinq.spring.data.sample.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>, CountryRepositoryCustom {

	List<Country> findAll();

	Country findById(int id);

	List<Country> findLikeName(String name);
}
