package com.redhat.bfarr.geoetl.model;




import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;


@CsvRecord(separator = ",")
public class CafeGeoData {
	final String type = "cafe";
	@DataField(pos = 1)
	private int Census_year;
	@DataField(pos = 2)
	private String Block_ID;
	@DataField(pos = 3)
	private String Property_ID;
	@DataField(pos = 4)
	private String Base_property_ID;
	@DataField(pos = 5)
	private String address;
	@DataField(pos = 6)
	private String area;
	@DataField(pos = 7, required = true)
	private String name;
	@DataField(pos = 8)
	private String Industry_code;
	@DataField(pos = 9)
	private String description;
	@DataField(pos = 10)
	private String Seating_type;
	@DataField(pos = 11)
	private int Number_of_seats;
	@DataField(pos = 12, required = true)
	private String Location;

    private Date lastUpdate = new Date();
    
    
	
	

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getType() {
		return type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Double getLongitude() {
		String l = Location.replace("(", "").replace(")", "").trim();
		return Double.valueOf(l.split(",")[1]);
	}


	public Double getLatitude() {
		String l = Location.replace("(", "").replace(")", "").trim();
		return Double.valueOf(l.split(",")[0]);
	}

	public int getCensus_year() {
		return Census_year;
	}

	public void setCensus_year(int census_year) {
		Census_year = census_year;
	}

	public String getIndustry_code() {
		return Industry_code;
	}

	public void setIndustry_code(String industry_code) {
		Industry_code = industry_code;
	}

	public String getSeating_type() {
		return Seating_type;
	}

	public void setSeating_type(String seating_type) {
		Seating_type = seating_type;
	}

	public int getNumber_of_seats() {
		return Number_of_seats;
	}

	public void setNumber_of_seats(int number_of_seats) {
		Number_of_seats = number_of_seats;
	}


	
	
	
}
