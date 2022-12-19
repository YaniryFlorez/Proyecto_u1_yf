package com.example.demo.clinica.repository;

import com.example.demo.clinica.modelo.Doctor;

public interface IDoctorRepository {

	//CRUD
	public Doctor buscar(String cedula);
	public void insertar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public void borrar(String cedula);
}
