package com.example.demo.clinica.service;

import com.example.demo.clinica.modelo.Doctor;

public interface IDoctorService {

	public void guardar(Doctor doctor);
	
	public void eliminar(String cedula);
	
	
}
