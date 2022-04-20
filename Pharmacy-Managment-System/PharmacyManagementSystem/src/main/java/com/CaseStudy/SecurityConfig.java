package com.CaseStudy;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


//
// 2)---->  put the anotation in her call @EnableWebSecurity ,it tells the spring security that this is a Web Security configeration

@EnableWebSecurity

public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		//Set your configuaration on the auth object
		
		// tell what type  of authentication you need base on that u provide the input 
// 1)-----> configuring as a in merory authentication "auth.inMemoryAuthentication()",when you do that you need to pass on USER " .withUser("Alpha")",
		//PASSWORD ".password("alpha7531")" and the ROLE ".roles("USER")" of the users you need
		auth.inMemoryAuthentication()
		           .withUser("foo")
		           .password("98745") 
		           .roles("USER")
		           .and() //use to add more username and password
		           .withUser("sam")
		           .password("12345")
		           .roles("ADMIN");
		
	}
// 3)----->
			// you dont want to store your password as clear text
			//clear text-it is basically saving the password hasard as a string so whoever is looking at that string can actually infar what your password is.
		
			//HOW TO SET A PASSWORD ENCODER-----> Just exposed an @ Bean of type "PasswordEncoder!"  thats the final step you need to do here
			
	
	@Bean	
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();// need to know
		
	}
//configuring Spring security Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	 http.authorizeRequests()// its is to open up(start) the method chaining 
	 

	           .antMatchers("/admin/**").hasRole("ADMIN")  
	           .antMatchers("/doctor/**").hasAnyRole("USER","ADMIN")  
	           .antMatchers("/").permitAll() 
	           .and().formLogin(); 
	
	}

}
