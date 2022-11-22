package com.example.demo.herencia;
import java.time.LocalDateTime;
public class Mainframework {

	public static void main(String[] args){
		
		/*PacienteTerceraEdadh pacienteTE = new PacienteTerceraEdadh();
        pacienteTE.setCedula("123123");
        pacienteTE.setCodigoIESS("123123");
        pacienteTE.setNombre("Daniel");
        pacienteTE.setTipo("TE");
        
        PacienteNinioh pacienteTE = new PacienteNinioh();
        pacienteTE.setCedula("123123");
        pacienteTE.setPesoNacimiento(8);
        pacienteTE.setNombre("Daniel");
        pacienteTE.setTipo("TE");
        */
        PacienteCancerh pacienteTE = new PacienteCancerh();
        pacienteTE.setCedula("123123");
        pacienteTE.setNombre("Daniel");
        pacienteTE.setTipo("C");
        
        Medicoh medico = new Medicoh();
        medico.setCedula("123123");
        medico.setNombre("Diana");
        
        CitaMedicah cita= new CitaMedicah();
        cita.agendar("123123", LocalDateTime.of(2022, 12, 2, 8, 30), pacienteTE, medico);
		
	}
}
