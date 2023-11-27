package com.projtest.idriss.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tshirts")
public class Tshirts {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String model;
	private Sizes size;
    private String Description;
    private float price;

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Sizes getSize() {
		return size;
	}
	public void setSize(Sizes size) {
		this.size = size;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
    
}
