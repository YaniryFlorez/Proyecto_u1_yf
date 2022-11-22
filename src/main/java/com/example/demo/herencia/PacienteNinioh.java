package com.example.demo.herencia;

public class PacienteNinioh extends Pacienteh {
	
	private String pesoNacimiento;
	
	 public Integer calcularDescuento() {
	    	System.out.println("paciente sin descuento");
	    	return 20;
	    }

	public String getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(String pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}
	

}
