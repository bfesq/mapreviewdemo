package com.redhat.bfarr.reviewq.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;





@Entity
@Table(name = "review")
public class Review {
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="review_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="id", unique=true, nullable=false)
    private Integer id;
	
	private String geoId;
	
	private Date dateReviewed;
	
	private Integer rating;
	
	@Size(min = 1, max = 512)
    private String description;
	
	@Size(min = 1, max = 256)
    private String name;

	@Size(min = 1, max = 512)
    private String email;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
	public String getGeoId() {
		return geoId;
	}

	public void setGeoId(String geoId) {
		this.geoId = geoId;
	}

	public Date getDateReviewed() {
		return dateReviewed;
	}

	public void setDateReviewed(Date dateReviewed) {
		this.dateReviewed = dateReviewed;
	}

	public Integer getRating() {
		return rating;
	}

	public void setStarRating(Integer rating) {
		this.rating = rating;
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
		return "CafeReview [id=" + id + ", dateReviewed=" + dateReviewed + ", rating=" + rating
				+ ", description=" + description + ", name=" + name + "]";
	}
	
	
}
