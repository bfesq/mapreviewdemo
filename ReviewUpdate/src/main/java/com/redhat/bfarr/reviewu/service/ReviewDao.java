package com.redhat.bfarr.reviewu.service;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.redhat.bfarr.reviewu.model.Review;

public interface ReviewDao extends CrudRepository<Review, String> {

	
	Review save(Review entity);
}
