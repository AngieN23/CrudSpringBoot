package com.sinfloo.demo.controler;

import org.springframework.stereotype.Controller;  


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;


import com.sinfloo.demo.interfaceService.InterfazClienteService;
import com.sinfloo.demo.modelo.Cliente;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;





@Controller
@RequestMapping
public class ControladorMetodosCrud {
	
	@Autowired
	private InterfazClienteService service;

	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Cliente>clientes = service.listar();
		model.addAttribute("clientes", clientes);
		return "index";
		
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "formulario";
	}
	@PostMapping("/save")
	public String save(@Validated Cliente c, Model model) {
		service.save(c);
		return "redirect:/listar";
	}
	@GetMapping("/editar/{IdCliente}")
	public String editar(@PathVariable int IdCliente, Model model) {
		Optional<Cliente>cliente=service.listarId(IdCliente);
		model.addAttribute("cliente", cliente);
		return "formulario";
	}
	@GetMapping("/eliminar/{IdCliente}")
	public String delete(Model model, @PathVariable int IdCliente) {
		service.delete(IdCliente);
		return "redirect:/listar";
	}
}
