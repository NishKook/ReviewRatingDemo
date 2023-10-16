package com.ekrikrit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.ekrikrit.demo.dao.productRepo;
import com.ekrikrit.demo.model.productClass;

@RestController
public class productController {
	@Autowired
	productRepo repo;
	
	@PostMapping(
			path = "/videos/{videoId}/reviews",
			consumes = {"application/json"},
			produces = {"application/json"})
	public ModelAndView addReviews(productClass product) {
		ModelAndView mv = new ModelAndView("ratingReviewDemo.jsp");
		mv.addObject("obj", product);
		System.out.println("It is working");
		return mv;
	}
}
