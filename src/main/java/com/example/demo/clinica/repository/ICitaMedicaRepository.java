package com.example.demo.clinica.repository;

import com.example.demo.clinica.modelo.CitaMedica;

public interface ICitaMedicaRepository {

	//CRUD
		public CitaMedica buscar(String numero);
		public void insertar(CitaMedica numero);
		public void actualizar(CitaMedica numero);
		public void borrar(String numero);
}
