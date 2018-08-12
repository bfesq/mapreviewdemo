package com.redhat.bfarr.geoetl;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;

import com.redhat.bfarr.geoetl.model.CafeGeoData;

public class ModelToMap {
	
	public Map<String, Object> processCafeGeoData(Exchange exchange) throws Exception {
		
        CafeGeoData cafeGeoData = (CafeGeoData) exchange.getIn().getBody();

		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("type", cafeGeoData.getType());
		map.put("name", cafeGeoData.getName());
		map.put("area", cafeGeoData.getArea());
		map.put("description", cafeGeoData.getDescription());
		map.put("address", cafeGeoData.getAddress());
		map.put("longitude", cafeGeoData.getLongitude());
		map.put("latitude", cafeGeoData.getLatitude());
		map.put("lastupdate", cafeGeoData.getLastUpdate());
		map.put("Location", cafeGeoData.getLocation());
		map.put("info", cafeGeoData.getSeating_type() + " " + cafeGeoData.getNumber_of_seats());
        return map;
    }

}
