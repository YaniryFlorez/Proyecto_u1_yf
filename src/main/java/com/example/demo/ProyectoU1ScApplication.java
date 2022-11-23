package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.springBoot.PacienteCancerSB;
import com.example.demo.springBoot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private PacienteTerceraEdadSB pacienteTE;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		System.out.println(pacienteTE);
		this.pacienteTE.setCodigoIESS("asadd");
		this.pacienteTE.setNombre("David");
		this.pacienteTE.setTipo("dsfd");
		this.pacienteTE.setCedula("12345");
		
		System.out.println(pacienteTE);
		
		citaMedicaSB.agendar()
	}

}
