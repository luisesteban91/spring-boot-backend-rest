package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

/*
 * <Cliente, Long> Es a la clase model a la cual va a estar relacionada,
 * y Long es el tipo de dato de la llave primaria de cliente.
 */

public interface IClienteDao extends CrudRepository<Cliente, Long>{


}