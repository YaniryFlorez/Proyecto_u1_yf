package com.example.demo.clinica.modelo;

public class Doctor {

	private String nombre;
	private String cedula;
	
	//get y set
	
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
	
	
	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
	
}
