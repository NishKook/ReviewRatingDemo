package com.ekrikrit.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ekrikrit.demo.model.productClass;

public interface productRepo extends JpaRepository<productClass, String>{

}