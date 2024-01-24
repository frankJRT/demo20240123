package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonaDao;
import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {

	Logger logger = LoggerFactory.getLogger(PersonaServiceImp.class);

	@Autowired
	private PersonaDao personaDao;

	@Override
	public List<Persona> getAllPersonas() {
		// TODO Auto-generated method stub
		
		logger.info("getAllPersona");
		return personaDao.findAll();
	}

	@Override
	public List<Persona> findPersonaByName(String name) {
		// TODO Auto-generated method stub
		logger.info("findPersonaByName");
		return personaDao.findByNombre(name);
	}

	@Override
	public Optional<Persona> findPersonaById(Long idPersona) {
		// TODO Auto-generated method stub
		logger.info("findPersonaById");
		return personaDao.findById(idPersona);
	}

	@Override
	public void deletePersona(Long idPersona) {
		// TODO Auto-generated method stub
		logger.info("deletePersona");
		var per = personaDao.findById(idPersona);
		if (!per.isEmpty())
			personaDao.delete(per.get());
	}

	@Override
	public Persona savePersona(Persona persona) {
		// TODO Auto-generated method stub
		logger.info("savePersona");
		return personaDao.save(persona);
	}

}
