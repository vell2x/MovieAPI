package com.apicapstone.movie;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
//@Transactional
public class MovieDao {

	@PersistenceContext
	private EntityManager em;

	public List<Movie> findAll() {
		return em.createQuery("from Moive", Movie.class).getResultList();
	}

}
