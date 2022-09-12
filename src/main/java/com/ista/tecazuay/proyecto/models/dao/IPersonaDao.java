package com.ista.tecazuay.proyecto.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.tecazuay.proyecto.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long> {

}
