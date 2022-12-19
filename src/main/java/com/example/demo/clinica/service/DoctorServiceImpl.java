package com.example.demo.clinica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.clinica.modelo.Doctor;
import com.example.demo.clinica.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{
@Autowired	
private IDoctorRepository doctorRepository;

	@Override
	public void guardar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.insertar(doctor);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.doctorRepository.borrar(cedula);
	}

	
}
