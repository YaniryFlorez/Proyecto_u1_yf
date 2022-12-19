package com.example.demo.clinica.service;

import com.example.demo.clinica.modelo.Paciente;

public interface IPacienteService {

	public Paciente buscar(String cedula);

	public void crear(Paciente paciente);

	public void modificar(Paciente paciente);

	public void quitar(String cedula);

	public void modificar(String cedula, String nombre, String apellido);
}
