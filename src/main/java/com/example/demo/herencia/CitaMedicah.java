package com.example.demo.herencia;

import java.time.LocalDateTime;

import com.example.demo.tradicional.CitaMedica;
import com.example.demo.tradicional.Medico;
import com.example.demo.tradicional.Paciente;

public class CitaMedicah {
	  private String numero;
	    private LocalDateTime fechaCita;
	    private LocalDateTime fechaAgenda;
	    private Medicoh medicoh;
	    private Pacienteh pacienteh;
	    private String ced_medicoh;


	    public void agendar(String numero, LocalDateTime fechaCita,Pacienteh ph, Medicoh mh) {
	        this.numero = numero;
	        this.fechaCita = fechaCita;
	        this.fechaAgenda = LocalDateTime.now();

	        this.pacienteh=ph;


	       Integer valorDescuento = ph.calcularDescuento();
	        System.out.println("Valor: " + valorDescuento);



	       this.medicoh = mh;
	        this.guardarCita(this);
	    }
	
	   private void guardarCita(CitaMedicah cita) {
	        
	        //Insertar en la base de datos, guardar cita
	        System.out.println(cita);
	    }
	    
	    @Override
	    public String toString() {
	        return "CitaMedicah [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
	                + ", medico=" + medicoh + ", paciente=" + pacienteh + ", ced_medico=" + ced_medicoh + "]";
	    }



	   // SET y GET
	    public String getNumero() {
	        return numero;
	    }



	   public void setNumero(String numero) {
	        this.numero = numero;
	    }



	   public LocalDateTime getFechaCita() {
	        return fechaCita;
	    }



	   public void setFechaCita(LocalDateTime fechaCita) {
	        this.fechaCita = fechaCita;
	    }



	   public LocalDateTime getFechaAgenda() {
	        return fechaAgenda;
	    }



	   public void setFechaAgenda(LocalDateTime fechaAgenda) {
	        this.fechaAgenda = fechaAgenda;
	    }



	   public Medicoh getMedicoh() {
	        return medicoh;
	    }



	   public void setMedicoh(Medicoh medicoh) {
	        this.medicoh = medicoh;
	    }



	   public Pacienteh getPacienteh() {
	        return pacienteh;
	    }



	   public void setPacienteh(Pacienteh pacienteh) {
	        this.pacienteh = pacienteh;
	    }


	
	
	
	


}
	
