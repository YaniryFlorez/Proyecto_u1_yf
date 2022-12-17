package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Producto;

@Repository
public class ProductoRepoImpl implements IProductoRepository{

	
	private static List<Producto> baseDeDatos = new ArrayList<>();

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		baseDeDatos.add(producto);
	}
	


}
