package com.CaseStudy.Controller.doctor;

import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection="Order")
public class Doctor {
    @NonNull
	private String username;
    @NonNull
	private String password;
}
