package com.example.demo.herencia;

public class PacienteTerceraEdadh extends Pacienteh {
	
	private String codigoIESS;
	
    public Integer calcularDescuento() {
    	System.out.println("paciente con descuento");
    	return 20;
    }
		

	public String getCodigoIESS() {
		return codigoIESS;
	}

	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}


	

}
