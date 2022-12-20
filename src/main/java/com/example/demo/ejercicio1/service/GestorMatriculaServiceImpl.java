package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GestorMatriculaServiceImpl implements IGestorMatriculaService{

	@Qualifier("Pesado")
	@Autowired
	private IMatriculaNuevaService1 matriculaNuevaService1;
	
	@Qualifier("liviano")
	@Autowired
	private IMatriculaNuevaService1 matriculaNuevaService2;
	
	@Override
	public void matricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		
	
	}

}
