package com.CaseStudy.Controller.Doctororder;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection="Order")
public class Order {
@Id
private int id;
@NonNull
private String drugName;
public Order() {
	
}
public Order(int id, String drugName) {
	super();
	this.id = id;
	this.drugName = drugName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDrugName() {
	return drugName;
}
public void setDrugName(String drugName) {
	this.drugName = drugName;
}
@Override
public String toString() {
	return "Order [id=" + id + ", drugName=" + drugName + "]";
}

	
}
