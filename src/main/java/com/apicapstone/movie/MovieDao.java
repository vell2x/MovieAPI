package com.apicapstone.movie;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.grandcircus.restserver.entity.Product;

@Repository
@Transactional
public class MovieDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Moive> findAll() {
		return em.createQuery("from Moive", Movie.class).getResultList();
	}
	

	
}
