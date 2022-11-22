package com.example.demo.herencia;

public class Pacienteh {
	
	private String nombre, cedula, tipo;
	
	
	protected Integer calcularDescuento(){
		System.out.println("Paciente con descuento del 20%");
		return 20;
	}
	
	//GETTER & SETTER



	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", cedula=" + cedula + ", tipo=" + tipo + "]";
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
	

}
