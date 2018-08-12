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


    private Double longitude;
    private Double latitude;

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
		latitude = Double.valueOf(Location.split(",")[0]);
		longitude = Double.valueOf(Location.split(",")[1]);
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	
	
	
}
