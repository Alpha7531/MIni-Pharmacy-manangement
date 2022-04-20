package com.CaseStudy.Controller.suppliers;

import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplierRepository extends MongoRepository<Supplier, Integer> {

	/*
	 * @DeleteQuery void deleteSupplier(String supplier);
	 */
}
