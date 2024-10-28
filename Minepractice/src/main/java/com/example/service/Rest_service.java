package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Restuarent_Entity;
import com.example.exception.Rest_exception;
import com.example.repository.Rest_repo;

@Service
public class Rest_service {
	
	@Autowired
	Rest_repo repo;

	public Restuarent_Entity createall(Restuarent_Entity entity) {
		// TODO Auto-generated method stub
		return  repo.save(entity);
	}

	public Restuarent_Entity getall(int id) {
		// TODO Auto-generated method stub
		Restuarent_Entity entity=repo.findById(id).orElseThrow(()->new Rest_exception("id not found"+id));
		return entity;
	}

	public Restuarent_Entity updateall(Restuarent_Entity oldEntity, int id) {
			// TODO Auto-generated method stub
		Restuarent_Entity newenEntity=repo.findById(id).orElseThrow(()->new Rest_exception("id not found not updated"+id));
		      newenEntity.setChinese(oldEntity.getChinese());
		      newenEntity.setIndian(oldEntity.getIndian());
		      newenEntity.setItalian(oldEntity.getItalian());
		      newenEntity.setLocations(oldEntity.getLocations());
		      newenEntity.setMexican(oldEntity.getMexican());
		      repo.save(newenEntity);
		      return newenEntity;
		      }

	public List<Restuarent_Entity> getallnodes() {
		// TODO Auto-generated method stub
		List<Restuarent_Entity>list=repo.findAll();
		return list;
	}
	
	

}
