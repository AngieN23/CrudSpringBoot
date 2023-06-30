package com.sinfloo.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.demo.interfaceService.InterfazClienteService;
import com.sinfloo.demo.interfaces.InterfazCliente;
import com.sinfloo.demo.modelo.Cliente;


@Service
public class ClienteService implements InterfazClienteService{
	
	@Autowired
	private InterfazCliente data;
	
	
	@Override
	public List<Cliente>listar(){
		return (List<Cliente>)data.findAll();
	}
	
	@Override
	public Optional<Cliente>listarId(int IdCliente){
		return data.findById(IdCliente);
	}
	
	@Override
	public int save(Cliente c) {
		int res = 0;
		Cliente cliente = data.save(c);
		if (!cliente.equals(null)) {
			res = 1;
		}
		return res;
	}
	
	@Override
	public void delete(int IdCliente) {
		data.deleteById(IdCliente);
	}

	

}
