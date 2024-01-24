package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Persona;

public interface PersonaService {
	
	List<Persona> getAllPersonas();
	
	List<Persona> findPersonaByName(String name);
	
	Optional <Persona> findPersonaById(Long idPersona);
	
	void deletePersona(Long idPersona);
	
	Persona savePersona(Persona persona); 	
}
