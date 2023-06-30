package com.sinfloo.demo.modelo;

import jakarta.persistence.Entity;


import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;




@Entity
@Table(name = "clientes")

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int IdCliente;
	
	
	private String PrimerNombre;
	private String SegundoNombre;
	private String PrimerApellido;
	private String SegundoApellido;
	private String Genero;
	private String Telefono;
	private String Email;
	
	public Cliente() {
		
	}
	
	
	public Cliente(int IdCliente, String PrimerNombre, String SegundoNombre, String PrimerApellido, String SegundoApellido, String Genero, String Telefono, String Email) {
		super();
		this.IdCliente = IdCliente;
		this.PrimerNombre = PrimerNombre;
		this.SegundoNombre = SegundoNombre;
		this.PrimerApellido = PrimerApellido;
		this.SegundoApellido = SegundoApellido;
		this.Genero = Genero;
		this.Telefono = Telefono;
		this.Email = Email;
	}
	
	
	 
	public int getIdCliente() {
		return IdCliente;
	}
	
	public void setIdCliente(int IdCliente) {
		this.IdCliente = IdCliente;
	}
	
	public String getPrimerNombre() {
		return PrimerNombre;
	}
	
	public void setPrimerNombre(String PrimerNombre) {
		this.PrimerNombre = PrimerNombre;
	}
	
	public String getSegundoNombre() {
		return SegundoNombre;
	}
	
	public void setSegundoNombre(String SegundoNombre) {
		this.SegundoNombre = SegundoNombre;
	}

	public String getPrimerApellido() {
		return PrimerApellido;
	}
	
	public void setPrimerApellido(String PrimerApellido) {
		this.PrimerApellido = PrimerApellido;
	}

	public String getSegundoApellido() {
		return SegundoApellido;
	}
	
	public void setSegundoApellido(String SegundoApellido) {
		this.SegundoApellido = SegundoApellido;
	}
	
	public String getGenero() {
		return Genero;
	}
	
	public void setGenero(String Genero) {
		this.Genero = Genero;
	}
	
	public String getTelefono() {
		return Telefono;
	}
	
	public void setTelefono(String Telefono) {
		this.Telefono = Telefono;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	


}
