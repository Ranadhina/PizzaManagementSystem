package com.onlinepizza.entity;


import com.onlinepizza.util.PizzaSize;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pizzaId;
	@OneToOne(cascade = CascadeType.ALL)
	private PizzaType pizzaType;
	private String pizzaName;
	private String pizzaDescription;
	// Base Price
	private Double pizzaCost;
	
	@Enumerated(EnumType.STRING)
	private PizzaSize pizzaSize;
	
	
	
	
	
	public Integer getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(Integer pizzaId) {
		this.pizzaId = pizzaId;
	}
	public PizzaType getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public String getPizzaDescription() {
		return pizzaDescription;
	}
	public void setPizzaDescription(String pizzaDescription) {
		this.pizzaDescription = pizzaDescription;
	}
	public Double getPizzaCost() {
		return pizzaCost;
	}
	public void setPizzaCost(Double pizzaCost) {
		this.pizzaCost = pizzaCost;
	}
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}
	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}


	
	

}
