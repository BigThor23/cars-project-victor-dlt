package com.examples.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.spring.controller.helper.CocheHelper;
import com.examples.spring.model.Coche;
import com.examples.spring.service.CocheService;

@Controller
@RequestMapping(value = {"/listar", "/"})
public class CocheController {

	@Autowired
	CocheHelper peopleHelper;

	@Autowired
	CocheService personService;	
	
	public static final String VIEW_CARS = "cars";
	public static final String VIEW_ADD_CAR = "addCAr";
	public static final String VIEW_EDIT_CAR = "editCar";

}