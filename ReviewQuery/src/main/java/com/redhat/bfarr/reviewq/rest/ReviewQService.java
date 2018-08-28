package com.redhat.bfarr.reviewq.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.redhat.bfarr.reviewq.model.Review;
import com.redhat.bfarr.reviewq.service.ReviewDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.ArrayList;

@RequestMapping("/ws/data")
@Path("/ws/data")
@RestController
public class ReviewQService {
	
	@Autowired
	ReviewDao reviewDao;
	
	@RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json")
    @GET()
    @Path("/review")
    @Produces("application/json")
    public List<Review> getReviews(@RequestParam("geoid") @QueryParam("geoid") String geoid) {
		List<Review> list = new ArrayList<>();
		reviewDao.findReviews(geoid).forEach(e -> list.add(e));
		return list;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/avg", produces = "application/json")
    @GET()
    @Path("/avg")
    @Produces("application/json")
    public Double avgRating(@RequestParam("geoid") @QueryParam("geoid") String geoId) {
    	Double val = reviewDao.findAvgRating(geoId);
    	if (val == null) {
    		val = 0.0;
    	} 
    	return val;
    }

}