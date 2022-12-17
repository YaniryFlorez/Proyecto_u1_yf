package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteSB {
	
	
	private String nombre;
	private String cedula;
	private String tipo; 	//Sirve para saber si es paciente niño o 3ra edad
	
	//Definimos un metodo
	
	public  Integer calcularDescuento() {
		
		System.out.println("Sin descuento");
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "PacienteH [nombre=" + nombre + ", cedula=" + cedula + ", tipo=" + tipo + "]";
	}


	

}
