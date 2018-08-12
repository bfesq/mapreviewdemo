package com.redhat.bfarr.geo.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "geodata")
public class GeoData {
	@Id 
	@SequenceGenerator(name="pk_sequence",sequenceName="entity_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="id", unique=true, nullable=false)
    private String id;

	@Size(min = 3, max = 100)
	private String type;
	
    @Size(min = 3, max = 100)
    private String name;
    @Size(min = 10, max = 100)
    private String area;
    @Size(min = 10, max = 1024)
    private String description;
    @Size(min = 10, max = 1024)
    private String address;

    private Double longitude;
    private Double latitude;
    
    @Size(min = 0, max = 2000)
    private String info;
    
    private Date lastUpdate;
    
    public GeoData() {
    }

    public GeoData(String id, String name) {
        this.id = id;
        this.name = name;
    }

   
    

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

	@Override
	public String toString() {
		return "GeoData [id=" + id + ", type=" + type + ", name=" + name + ", area=" + area + ", description="
				+ description + ", address=" + address + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", info=" + info + ", lastUpdate=" + lastUpdate + "]";
	}

	

    
    
}
