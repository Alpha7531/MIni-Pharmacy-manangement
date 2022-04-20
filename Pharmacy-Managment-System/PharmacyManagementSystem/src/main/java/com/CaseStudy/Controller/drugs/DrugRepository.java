package com.CaseStudy.Controller.drugs;

import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;


public interface DrugRepository extends MongoRepository<Drug, Integer> {

	
}
