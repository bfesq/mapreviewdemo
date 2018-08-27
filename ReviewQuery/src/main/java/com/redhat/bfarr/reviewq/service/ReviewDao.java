package com.redhat.bfarr.reviewq.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.redhat.bfarr.reviewq.model.Review;

public interface ReviewDao extends CrudRepository<Review, String> {

	
	// Basic query for now presume lon and lat sorted
	@Query("select c from Review c where c.geoId = :geoId order by dateReviewed desc")
	List<Review> findReviews(@Param("geoId") String geoId);
	
	@Query("select avg(c.rating) from Review c where c.geoId = :geoId ")
	Double findAvgRating(@Param("geoId") String geoId);
}
