package com.redhat.bfarr.reviewu.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.redhat.bfarr.reviewu.RandomReviewGenerator;
import com.redhat.bfarr.reviewu.model.Review;
import com.redhat.bfarr.reviewu.service.ReviewDao;

import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

@RequestMapping("/ws/data")
@Path("/ws/data")
@RestController
public class ReviewUService {
	
	@Autowired
	ReviewDao reviewDao;
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/addrandomreview", produces = "application/json")
    @GET()
    @Path("/addrandomreview")
    @Produces("application/json")
    public Review addRandomReview(@RequestParam("geoid") @QueryParam("geoid") String geoId) {
		RandomReviewGenerator rrg = new RandomReviewGenerator();
		Review review = new Review();
		review.setDateReviewed(new Date());
		review.setGeoId(geoId);
		int rating = rrg.getRating();
		
		review.setDescription(rrg.getDescription(rating));
		String name = rrg.getName();
		review.setName(name);
		review.setRating(rating);
		review.setEmail(name + "@example.com");
		System.out.println(review.toString());
		return reviewDao.save(review);
		
    }
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/update", produces = "application/json")
    @POST()
    @Produces("application/json")
	@Consumes("application/json")
    public Review addReview(Review review) {
		
		// Validate data
		
		// Send an email to jms queue

		return reviewDao.save(review);
    }


}