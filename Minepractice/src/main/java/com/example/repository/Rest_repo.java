package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Restuarent_Entity;

@Repository
public interface Rest_repo extends JpaRepository<Restuarent_Entity, Integer> {

}
