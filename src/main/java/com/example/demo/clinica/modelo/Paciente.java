package com.example.demo.clinica.modelo;

public class Paciente {
	private String cedula;
	private String nombre;
	private String apellido;
	
	//set y get
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	@Override
	public String toString() {
		return "Paciente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	
}
