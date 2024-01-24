package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Persona;

public interface PersonaDao extends JpaRepository<Persona, Long> {

	List<Persona> findByNombre(String name);

}
