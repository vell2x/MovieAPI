package com.apicapstone.movie;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class MovieDao {
	@PersistenceContext
	private EntityManager em;

	public List<Movie> findAll() {
		return em.createQuery("from Movie", Movie.class).getResultList();
	}
	
	public void create(Movie movie) {
	try{
		em.persist(movie);
		
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public void delete(int id) {
		Movie movie = em.getReference(Movie.class, id);
		em.remove(movie);
	}
}