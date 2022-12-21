package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service("pesado")
public class MatriculaPesadoServiceImpl implements IMatriculaNuevaService1 {

	@Override
	public BigDecimal matricular(BigDecimal precio){
		// TODO Auto-generated method stub
		System.out.println("Matriculado pesado");
		System.out.println("calculo del descuento de 2000");
		BigDecimal valor = precio.multiply(new BigDecimal(0.15));
		return valor;
		
		
	}


}
