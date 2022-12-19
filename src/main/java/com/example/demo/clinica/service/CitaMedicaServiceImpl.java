package com.example.demo.clinica.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.clinica.modelo.CitaMedica;
import com.example.demo.clinica.modelo.Paciente;
import com.example.demo.clinica.repository.ICitaMedicaRepository;
import com.example.demo.clinica.repository.IDoctorRepository;
import com.example.demo.clinica.repository.IPacienteRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
	
	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	@Autowired
	private IDoctorRepository doctorRepository;
	@Autowired
	private IPacienteRepository pacienteRepository;
	

	@Override
	public void generarCita(String paciente, String doctor) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setFechaAgenda(LocalDateTime.now());
		citaMedica.setFechaCita(LocalDateTime.now());
		citaMedica.setDoctor(this.doctorRepository.buscar(doctor));
		citaMedica.setPaciente(this.pacienteRepository.buscar(paciente));
		
		this.citaMedicaRepository.insertar(citaMedica);
		
		
		
		
	}

}
