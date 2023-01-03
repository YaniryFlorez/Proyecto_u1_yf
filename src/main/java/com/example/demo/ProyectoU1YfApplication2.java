package com.example.demo;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

@SpringBootApplication
public class ProyectoU1YfApplication2 {

	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService ipropietarioService;
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1YfApplication2.class, args);
	
	
	}

	public void run(String... args) throws Exception {

		// Matricula

		// Opcion1
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("Tocyota");
		vehi.setPlaca("PSGD2312");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("P");
		this.vehiculoService.crear(vehi);
		vehi.setMarca("Toyota");
		vehi.setPrecio(new BigDecimal(15000));
		this.vehiculoService.modificar(vehi);

		// Opcion2
		Propietario propietario = new Propietario();
		propietario.setApellido("Ruiz");
		propietario.setNombre("Luis carlos");
		propietario.setCedula("1241587458");
		propietario.setFechaNaciemiento(LocalDateTime.of(1999, 12, 12, 12, 12));
		ipropietarioService.guardar(propietario);

		// Opcion 3
		this.matriculaService.matricular("1241587458", "PSGD2312");

	}



}
