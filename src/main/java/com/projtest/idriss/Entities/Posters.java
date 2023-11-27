package com.projtest.idriss.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posters")
public class Posters {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String name;
private String description;
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

}
