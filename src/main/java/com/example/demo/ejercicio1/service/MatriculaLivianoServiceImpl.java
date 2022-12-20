package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service("liviana")
public class MatriculaLivianoServiceImpl implements IMatriculaNuevaService1 {

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado liviano");
	}
	
}
