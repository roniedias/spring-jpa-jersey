package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import br.com.cinq.spring.data.sample.entity.Country;

public interface CountryRepositoryCustom {
	List<Country> findLikeName(String name);
}
