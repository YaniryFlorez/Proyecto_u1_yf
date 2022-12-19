package com.example.demo.clinica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.clinica.modelo.Doctor;
import com.example.demo.tradicional.Medico;
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {

	private List<Doctor> base = new ArrayList<>();
	
	@Override
	public Doctor buscar(String cedula) {
		// TODO Auto-generated method stub
		
		Doctor doctor = null;
		for(Doctor doc : base) {
			if(doc.getCedula().equals(cedula)) {
				doctor=doc;
				
			}
		}
		return doctor;
	}

	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		base.add(doctor);
		System.out.println(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		Doctor doct = null;
		for(Doctor doc : base) { //me recorre la base de datos
			if(doc.getCedula().equals(doctor.getCedula())) {
				doct = doc;
			}
	     }
		base.remove(doct);
		base.add(doctor);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(cedula));
		
	}

}
