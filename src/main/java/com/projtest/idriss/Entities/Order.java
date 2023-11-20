package com.projtest.idriss.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order extends Chart{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private PaymentMethod paymethod;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PaymentMethod getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(PaymentMethod paymethod) {
		this.paymethod = paymethod;
	}

}
