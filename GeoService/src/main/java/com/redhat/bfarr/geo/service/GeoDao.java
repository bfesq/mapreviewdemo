package com.redhat.bfarr.geo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.redhat.bfarr.geo.model.GeoData;


public interface GeoDao extends CrudRepository<GeoData, String> {

	GeoData save(GeoData entity);
	
	@Query("select c from GeoData c where c.type = :type ")
	List<GeoData> findAllByType(@Param("type") String type);
	
	@Query(value = "select * from GeoData where type = :type and to_tsvector(address || ' ' || area || ' ' || description || ' ' || name) @@to_tsquery(:searchterm)", 
			nativeQuery = true)
	List<GeoData> searchAllByType(@Param("type") String type, @Param("searchterm") String searchterm);
	
	// Basic query for now presume lon and lat sorted
	@Query("select c from GeoData c where c.type = :type and c.longitude >= :lon1 and c.longitude <= :lon2 and c.latitude >= :lat1 and c.latitude <= :lat2 ")
	List<GeoData> findWithin(@Param("type") String type, @Param("lat1") Double lat1, @Param("lat2") Double lat2, 
			@Param("lon1") Double lon1, @Param("lon2") Double lon2);
	
	
}
