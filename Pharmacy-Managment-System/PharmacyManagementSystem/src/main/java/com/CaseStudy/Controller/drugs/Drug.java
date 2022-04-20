package com.CaseStudy.Controller.drugs;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Drug")
public class Drug {
	@Id
	private int id;
	private String drugName;
	private int drugPrice;

	public Drug() {

	}

	public Drug(int id, String drugName, int drugPrice) {
		super();
		this.id = id;
		this.drugName = drugName;
		this.drugPrice = drugPrice;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public int getDrugPrice() {
		return drugPrice;
	}

	public void setDrugPrice(int drugPrice) {
		this.drugPrice = drugPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Drug [id=" + id + ", drugName=" + drugName + ", drugPrice=" + drugPrice + "]";
	}

}
