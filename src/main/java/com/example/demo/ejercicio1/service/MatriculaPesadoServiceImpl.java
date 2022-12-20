package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service("pesado")
public class MatriculaPesadoServiceImpl implements IMatriculaNuevaService1 {

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado pesado");
		System.out.println("calculo del descuento de 2000");
	}
}
