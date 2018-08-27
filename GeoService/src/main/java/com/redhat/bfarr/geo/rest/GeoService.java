package com.redhat.bfarr.geo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.redhat.bfarr.geo.model.GeoData;
import com.redhat.bfarr.geo.service.GeoDao;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.ArrayList;

@RequestMapping("/ws/data")
@Path("/ws/data")
@RestController
public class GeoService {
	
	@Autowired
    GeoDao geoDao;
	
	@RequestMapping(method = RequestMethod.GET, value = "/save", produces = "application/json")
    @POST()
    @Produces("application/json")
	@Consumes("application/json")
    public GeoData addGeo(GeoData geodata) {
		return geoDao.save(geodata);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json")
    @GET()
    @Path("/all")
    @Produces("application/json")
    public List<GeoData> getAll(@RequestParam("type") @QueryParam("type") String type) {
		List<GeoData> list = new ArrayList<>();
		geoDao.findAllByType(type).forEach(e -> list.add(e));
		return list;
    }

	@RequestMapping(method = RequestMethod.GET, value = "/searchall", produces = "application/json")
    @GET()
    @Path("/searchall")
    @Produces("application/json")
    public List<GeoData> searchAll(@RequestParam("type") @QueryParam("type") String type, @RequestParam("searchterm") @QueryParam("searchterm") String searchterm) {
		List<GeoData> list = new ArrayList<>();
		if (searchterm == null || searchterm.trim().isEmpty()) {
			geoDao.findAllByType(type).forEach(e -> list.add(e));
		} else {
			String[] terms = searchterm.trim().split(" ");
			StringBuilder sb = new StringBuilder();
			sb.append(terms[0]);
			for (int i = 1; i < terms.length; i ++) {
				sb.append(" & ").append(terms[i]);
			}
			
			geoDao.searchAllByType(type, sb.toString()).forEach(e -> list.add(e));
		}
		return list;
    }
	
    @RequestMapping(method = RequestMethod.GET, value = "/within", produces = "application/json")
    @GET()
    @Path("/within")
    @Produces("application/json")
    public List<GeoData> findWithin(
    		@RequestParam("type") @QueryParam("type") String type,
            @RequestParam("lat1") @QueryParam("lat1") String lat1,
            @RequestParam("lon1") @QueryParam("lon1") String lon1,
            @RequestParam("lat2") @QueryParam("lat2") String lat2,
            @RequestParam("lon2") @QueryParam("lon2") String lon2) {
    	try {
	    	Double latx = Double.valueOf(lat1) > Double.valueOf(lat2) ? Double.valueOf(lat2) : Double.valueOf(lat1);
	    	Double laty = Double.valueOf(lat1) > Double.valueOf(lat2) ? Double.valueOf(lat1) : Double.valueOf(lat2);
	    	
	    	Double lonx = Double.valueOf(lon1) > Double.valueOf(lon2) ? Double.valueOf(lon2) : Double.valueOf(lon1);
	    	Double lony = Double.valueOf(lon1) > Double.valueOf(lon2) ? Double.valueOf(lon1) : Double.valueOf(lon2);
	    	
	    	return geoDao.findWithin(type, latx, laty, lonx, lony);
    	} catch (NumberFormatException ne) {
    		ne.printStackTrace();
    		return null;
    	}

    }

}