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
public class ProyectoU1YfApplication {
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1YfApplication.class, args);
	
	
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SPRING BOOT");
		
		// 1 manera
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("Toyta");
		vehi.setPlaca("PDF12654");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("P");
		this.iVehiculoService.crear(vehi);
		//Es una opcion
		vehi.setPrecio(new BigDecimal(10000));
		vehi.setMarca("Toyota");
		this.iVehiculoService.modificar(vehi);
		
		// 2 manera
		
		
		Propietario propietario = new Propietario();
		propietario.setApellido("Colon");
		propietario.setCedula("154774566");
		propietario.setFechaNacimiento(LocalDateTime.of(1978, 8,31,12,35));
		propietario.setNombre("Edison");
		 this.iPropietarioService.guardar(propietario);
		
		//3 manera
		 this.iMatriculaService.matricular("15774566", "PDF1265");
		
		
		
		
		
	}

}
