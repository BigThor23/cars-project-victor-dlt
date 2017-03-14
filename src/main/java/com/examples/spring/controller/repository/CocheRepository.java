package com.examples.spring.controller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.spring.model.Coche;

import com.examples.spring.model.Coche;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Integer> {


}
