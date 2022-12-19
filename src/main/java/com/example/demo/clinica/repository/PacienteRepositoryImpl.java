package com.example.demo.clinica.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import org.springframework.stereotype.Repository;

import com.example.demo.clinica.modelo.Paciente;
@Repository
public class PacienteRepositoryImpl implements IPacienteRepository{

	private List<Paciente> base = new ArrayList<>();
	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		Paciente paciente = null;
		for(Paciente p : base) {
			if(p.getCedula().equals(cedula)) {
				paciente=p;
			}
		}
		return paciente;
	}

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		base.add(paciente);
		System.out.println(paciente);
		
		
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		Paciente pacient = null;
		for(Paciente p : base) {
			if(p.getCedula().equals(paciente.getCedula())) {
				pacient=p;
			}
			
		}
		base.remove(pacient);
		base.add(paciente);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(cedula));
		
	}

}
