package com.sunil.cardatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.cardatabase.domain.Car;
import com.sunil.cardatabase.repository.CarRepository;

@RestController
public class CarController {
	
	
	@Autowired
	private CarRepository repository;
	
		

	@RequestMapping("/cars")
	public Iterable <Car> getCars(){
	
		return repository.findAll();
	}
	
	
	
}
