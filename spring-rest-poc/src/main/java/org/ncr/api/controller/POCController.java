package org.ncr.api.controller;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class POCController implements BeanNameAware{
	
	@RequestMapping("excepion")
	@ResponseStatus(value=HttpStatus.OK)
	public void exceptionThrower() {
		throw new RuntimeException("This is Exception from Controller");		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("register " +beanName);		 
	}
	
}
