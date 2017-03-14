package com.examples.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examples.spring.model.Coche;
import com.examples.spring.controller.repository.CocheRepository;

@Service
public class CocheService {
	
	@Autowired
	CocheRepository productRepository;
	

}
