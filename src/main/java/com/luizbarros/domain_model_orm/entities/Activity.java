package com.luizbarros.domain_model_orm.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_activity")
public class Activity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@Column(columnDefinition = "TEXT") // larger descriptions (255+)
	private String description;
	private Double price;
	
	@ManyToMany
	@JoinTable(name = "tb_activity_attendant",
		joinColumns = @JoinColumn(name = "activity_id"),
		inverseJoinColumns = @JoinColumn(name = "attendant_id"))
	private Set<Attendant> attendants = new HashSet<>();
	
	public Activity() {
	}

	public Activity(Integer id, String name, String description, Double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Set<Attendant> getAttendants() {
		return attendants;
	}	
}
