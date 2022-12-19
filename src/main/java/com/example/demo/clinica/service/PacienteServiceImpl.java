package com.example.demo.clinica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.clinica.modelo.Paciente;
import com.example.demo.clinica.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService{
@Autowired	
private IPacienteRepository pacienteRepository;

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscar(cedula);
	}

	@Override
	public void crear(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.insertar(paciente);
	}

	@Override
	public void modificar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
		
	}

	@Override
	public void quitar(String cedula) {
		// TODO Auto-generated method stub
		this.pacienteRepository.borrar(cedula);
		
	}

	@Override
	public void modificar( String cedula, String nombre, String apellido) {
		// TODO Auto-generated method stub
		Paciente paciente = this.pacienteRepository.buscar(cedula);
		paciente.setNombre(nombre);
		paciente.setNombre(nombre);
		
		this.pacienteRepository.actualizar(paciente);
	}

}
