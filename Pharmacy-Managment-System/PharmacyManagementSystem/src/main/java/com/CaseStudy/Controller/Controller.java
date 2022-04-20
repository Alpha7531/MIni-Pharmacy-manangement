package com.CaseStudy.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.CaseStudy.Controller.Doctororder.Order;
import com.CaseStudy.Controller.Doctororder.OrderRepository;
import com.CaseStudy.Controller.drugs.Drug;
import com.CaseStudy.Controller.drugs.DrugRepository;
import com.CaseStudy.Controller.suppliers.Supplier;
import com.CaseStudy.Controller.suppliers.SupplierRepository;

@RestController

public class Controller {
	@Autowired
	private DrugRepository drugRepository;

	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private OrderRepository orderRepository;
//-----------------------------------------------------------********-------------------------------------------------------------------------------------
	/*
	 * @GetMapping("/admin") public String admin() { return ("Welcome Admin"); }
	 * 
	 * @GetMapping("/user") public String user() { return ("Welcome User"); }
	 */
//-------------------------------------------------------------******-------------------------------------------------------------------------------------
	
	@GetMapping("/admin/viewdrugs")
	public List<Drug> showDrugsToAdmin() {
		return drugRepository.findAll();
	}
	
	@GetMapping("/admin/viewSupplier")
	public List<Supplier> showSupply() {
		return supplierRepository.findAll();
	}
	@GetMapping("/admin/vieworder")
	public List<Order> showorder() {
		return orderRepository.findAll();
	}
	

	@PostMapping("/admin/addDrugs")
	public Drug addDrugByAdmin(@RequestBody Drug drug) {
		return drugRepository.insert(drug);
	}
	
	@PostMapping("/admin/addSupplier")
	public Supplier addSupplier(@RequestBody Supplier supplier) {
		return supplierRepository.insert(supplier);
	}

	
	
	 @DeleteMapping("/admin/deleteDrug/{id}")
	 public String deleteDrugByAdmin(@PathVariable int id)
	 { 
		drugRepository.deleteById(id);
		return "Drug deleted Successfully"; 
	 }
	 @DeleteMapping("/admin/deletesupplier/{id}")
	 public String deletesupplierByAdmin(@PathVariable int id)
	 { 
		supplierRepository.deleteById(id);
		return "Supplier deleted Successfully"; 
	 }
	 @GetMapping("/doctor/viewdrugs")
	public List<Drug> showDrugsToDoctor() {
		return drugRepository.findAll();
	}

	@PostMapping("/doctor/addorder")
	public Order addorder(@RequestBody Order order) {
		return  orderRepository.insert(order);
	}
	
	 @DeleteMapping("/doctor/buydrug/{id}")
	 public String buyDrugByDoctor(@PathVariable int id)
	 { 
		drugRepository.deleteById(id);
		
		return "Buy Successfully"; 
	 }

	

	
	
	
	
	
	
	
	
	
	
	/*@GetMapping("doctor/getdrug/{id}")
	   public Optional<Drug> getAdminProfileById(@PathVariable("id") int id){
		   return drugRepository.findById(id);
	   }*/

}
