package com.example.controller;

import java.util.List;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Restuarent_Entity;
import com.example.repository.Rest_repo;
import com.example.service.Rest_service;

import jakarta.persistence.Id;

@RestController
@RequestMapping("/api/v1/")
public class Rest_controller {
	
	@Autowired
	Rest_service rest_service;
	
	@Autowired
	Rest_repo repo;
	
	@PostMapping("/menu")
	@ResponseStatus(HttpStatus.CREATED)
	public Restuarent_Entity postMethodName(@RequestBody Restuarent_Entity entity) {
		//TODO: process POST request
		
		return rest_service.createall(entity);
	}
	
	@GetMapping("/menu/{id}")
	public Restuarent_Entity getMethodName(@PathVariable int id) {
		return rest_service.getall(id);
	}
	
	@PutMapping("/menu/{id}")
	public Restuarent_Entity updateMethodName(@RequestBody Restuarent_Entity entity,@PathVariable int id) {
		return rest_service.updateall(entity,id);
	}
	
    @GetMapping("/menu")
    public List<Restuarent_Entity>getall(){
                return rest_service.getallnodes();
      }
    
    @DeleteMapping("/menu/{id}")
    public void deleteentity(@PathVariable int id) {
       repo.deleteById(id);
    }
	
	
	
	
	
	
	

}
