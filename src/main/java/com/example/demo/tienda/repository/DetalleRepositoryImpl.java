package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Detalle;

public class DetalleRepositoryImpl implements IDetalleRepository{

	private List<Detalle> baseDeDatos = new ArrayList();
	
	@Override
	public void instertar(Detalle detalle) {
		// TODO Auto-generated method stub
	baseDeDatos.add(detalle);
	
	}

}
