package com.CaseStudy.Controller.suppliers;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Supplier")
public class Supplier {

	@Id
	private int id;
	private String name;
	private String contactNo;

	public Supplier(int id, String name, String contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", contactNo=" + contactNo + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
