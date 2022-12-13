package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.tienda.modelo.Cliente;

public class ClienteRepositoryImpl implements IClienteRepository{
	
	private List<Cliente> baseDeDatos = new ArrayList();
	

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("se agrego el cliente"+ cliente);
		baseDeDatos.add(cliente);
		
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente cliente = null;
		for (Cliente cl : baseDeDatos) {
			if (cl.getCedula().equals(cedula) {
				cuenta = cb;
			}
		}
		baseCuentas.remove(cuenta);
		baseCuentas.add(cuentaBancaria);
		System.out.println("Se actualiza la cuenta: " + cuentaBancaria);

	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cli = buscar(cedula);
		baseDeDatos.remove(cedula);
	}
	

}
