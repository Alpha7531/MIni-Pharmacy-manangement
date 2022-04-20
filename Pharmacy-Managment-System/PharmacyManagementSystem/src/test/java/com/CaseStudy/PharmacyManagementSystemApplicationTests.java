package com.CaseStudy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.nio.file.Path;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


import com.CaseStudy.Controller.Controller;

@SpringBootTest

class PharmacyManagementSystemApplicationTests {
	
	
//Normal testing the controller class
	@Autowired
	private Controller control;//connecting to the controller  class to test it 
	
	@Test
	@DisplayName("Controller class")
	void contextLoads() throws Exception {
		
		assertThat(control).isNotNull();
		
	}
	
	/*
	 * @Test void showDrugsToAdmin() throws IOException {
	 * ControllerFile=Files.readString(Path.of(null));
	 * listofDrug=getControllerList(listofDrug)
	 * Assertions.asserEquals(listofDrug.toString(),//interface
	 * name.displayTimetable("karachi").ToString()
	 * 
	 * 
	 * }
	 */
	
	
	
	
	
//testing Http Request
	
	
	  
	  
	
	  
	 
	
	
	

}
