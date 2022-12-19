package com.example.demo.clinica.repository;

import com.example.demo.clinica.modelo.Paciente;

public interface IPacienteRepository {

	//CRUD
		public Paciente buscar(String cedula);
		public void insertar(Paciente paciente);
		public void actualizar(Paciente paciente);
		public void borrar(String cedula);
}
