package com.sinfloo.demo.interfaceService;


import java.util.List; 
import java.util.Optional;
import com.sinfloo.demo.modelo.Cliente;

public interface InterfazClienteService {
	
	
	public List<Cliente>listar();
	public Optional<Cliente>listarId(int IdCliente); 
	public int save(Cliente c);
	public void delete(int IdCliente);

}
