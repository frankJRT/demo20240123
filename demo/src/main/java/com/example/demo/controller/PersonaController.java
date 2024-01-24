package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;


@RestController
@RequestMapping("/persona")
public class PersonaController {

	Logger logger = LoggerFactory.getLogger(PersonaController.class);
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/personas")
	public ResponseEntity<List<Persona>> getPersonas() {
		return ResponseEntity.ok(personaService.getAllPersonas());
	}
	
	@GetMapping("personasByName/{name}")
	public ResponseEntity<List<Persona>> getPersonas(@PathVariable String name) {
		return ResponseEntity.ok(personaService.findPersonaByName(name));
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<Persona> savePersona(@RequestBody Persona persona){
		return ResponseEntity.ok(personaService.savePersona(persona));
	}	
}
