package com.redhat.bfarr.reviewq.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;



@Entity
@Table(name = "review")
public class Review {
	@Id
    private String id;
	
	private String geoId;
	
	private Date dateReviewed;
	
	private Integer starRating;
	
	@Size(min = 1, max = 2048)
    private String description;
	
	@Size(min = 1, max = 256)
    private String name;

	@Size(min = 1, max = 512)
    private String email;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	public String getCafeId() {
		return geoId;
	}

	public void setCafeId(String cafeId) {
		this.geoId = cafeId;
	}

	public Date getDateReviewed() {
		return dateReviewed;
	}

	public void setDateReviewed(Date dateReviewed) {
		this.dateReviewed = dateReviewed;
	}

	public Integer getStarRating() {
		return starRating;
	}

	public void setStarRating(Integer starRating) {
		this.starRating = starRating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CafeReview [id=" + id + ", dateReviewed=" + dateReviewed + ", starRating=" + starRating
				+ ", description=" + description + ", name=" + name + "]";
	}
	
	
}
