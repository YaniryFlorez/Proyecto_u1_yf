package com.example.demo;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;
import com.example.demo.clinica.modelo.Doctor;
import com.example.demo.clinica.modelo.Paciente;
import com.example.demo.clinica.service.ICitaMedicaService;
import com.example.demo.clinica.service.IDoctorService;
import com.example.demo.clinica.service.IPacienteService;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;
import com.example.demo.herencia.PacienteCancerH;
import com.example.demo.herencia.PacienteTerceraEdadH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteCancerSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1YfApplication2 {
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IDoctorService doctorService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1YfApplication2.class, args);
	
	
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SPRING BOOT");
		
		// 1 manera
		Paciente pac = new Paciente();
		pac.setCedula("12345");
		pac.setNombre("Maria Jose");
		pac.setApellido("Lopez");
		this.pacienteService.crear(pac);
		
		
		//una opcion
		/*
		pac.setNombre();
		vehi.setMarca("Toyota");
		this.iVehiculoService.modificar(vehi);   */
		
		// 2 manera
		
		Doctor doc =new Doctor();
		doc.setCedula("54321");
		doc.setNombre("Carlos");
	    this.doctorService.guardar(doc);
		
		
		
		//3 manera
	    this.citaMedicaService.generarCita("12345", "54321");
		
		
		
		
		
		
	}

}
