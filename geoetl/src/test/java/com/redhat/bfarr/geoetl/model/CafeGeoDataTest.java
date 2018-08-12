package com.redhat.bfarr.geoetl.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CafeGeoDataTest {
	
	@Test
	public void locationParsing() {
		CafeGeoData cafeGeoData = new CafeGeoData();
		cafeGeoData.setLocation("(-37.8073977449, 144.952572509)");

		assertEquals(Double.valueOf("-37.8073977449"), cafeGeoData.getLatitude());
		
		assertEquals(Double.valueOf("144.952572509"), cafeGeoData.getLongitude());
	}
	
	
	
}
