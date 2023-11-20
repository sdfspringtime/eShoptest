package com.projtest.idriss.Entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;

@Entity
@Table(name="charts")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Chart {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private float sum;
@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
@JoinColumn(name = "chartid")
private Set<Posters> posters = new HashSet<>();
@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
@JoinColumn(name = "chartid")
private Set<Tshirts> tees = new HashSet<>();
@OneToOne
private Users user;

}
