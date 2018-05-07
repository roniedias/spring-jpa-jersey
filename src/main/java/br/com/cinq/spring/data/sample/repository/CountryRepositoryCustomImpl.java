package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cinq.spring.data.sample.entity.Country;

@Repository
@Transactional(readOnly = true)
public class CountryRepositoryCustomImpl implements CountryRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Country> findLikeName(String name) {
		Query query = entityManager.createNativeQuery("SELECT c.* FROM country as c WHERE c.name LIKE ?",
				Country.class);
		query.setParameter(1, name + "%");
		return query.getResultList();
	}

}
