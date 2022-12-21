package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service("liviana")
public class  MatriculaLivianoServiceImpl implements IMatriculaNuevaService1 {
	

	@Override
	public BigDecimal matricular(BigDecimal precio) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.IVehiculoRepository.buscar(placa);
		System.out.println("Matriculado liviano");
		BigDecimal valor = precio.multiply(new BigDecimal(0,10));
		
	}

	
	
}
