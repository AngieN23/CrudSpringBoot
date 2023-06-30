package com.sinfloo.demo.interfaces;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.sinfloo.demo.modelo.Cliente;


@Repository
public interface InterfazCliente extends CrudRepository<Cliente, Integer>{

}
