package com.CaseStudy.Controller.Doctororder;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CaseStudy.Controller.drugs.Drug;

public interface OrderRepository extends MongoRepository<Order, String> {

	
}