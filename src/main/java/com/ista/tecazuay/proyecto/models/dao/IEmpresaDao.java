package com.ista.tecazuay.proyecto.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.tecazuay.proyecto.models.entity.Empresa;

public interface IEmpresaDao extends CrudRepository<Empresa, Long> {

}
