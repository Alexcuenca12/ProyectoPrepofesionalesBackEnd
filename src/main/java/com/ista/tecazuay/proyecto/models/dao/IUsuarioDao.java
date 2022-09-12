package com.ista.tecazuay.proyecto.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.tecazuay.proyecto.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
