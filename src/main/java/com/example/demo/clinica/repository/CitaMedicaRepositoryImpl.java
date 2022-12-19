package com.example.demo.clinica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.clinica.modelo.CitaMedica;
@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	private List<CitaMedica> base = new ArrayList<>();
	
	@Override
	public CitaMedica buscar(String numero) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = null;
		for(CitaMedica citaM : base) {
			if(citaM.getNumero().equals(numero)) {
				citaMedica=citaM;
			}
		}
		
		return citaMedica;
	}

	@Override
	public void insertar(CitaMedica numero) {
		// TODO Auto-generated method stub
		base.add(numero);
		System.out.println(numero);
	}

	@Override
	public void actualizar(CitaMedica numero) {
		// TODO Auto-generated method stub
		CitaMedica citaMedic = null;
		for(CitaMedica cita : base) {
			if(cita.getNumero().equals(numero.getNumero())) {
				citaMedic=cita;
			}
		}
		
		base.remove(citaMedic);
		base.add(numero);
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(numero));
	}

}
