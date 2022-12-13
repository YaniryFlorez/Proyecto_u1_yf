package com.example.demo.tienda.service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.repository.IClienteRepository;

public class ClienteServiceImpl implements IClienteService{

	private IClienteRepository clienteRepository;
	

	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepository.insertar(cliente);
		
	}

	
	

}
