package com.example.demo.tienda.service;

import java.util.List;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Factura;
import com.example.demo.tienda.modelo.ItemTO;
import com.example.demo.tienda.repository.IClienteRepository;
import com.example.demo.tienda.repository.IFacturaRepository;

public class FacturaServiceImpl implements IFacturaService{
	
	private IFacturaRepository facturaRepository;
	private IClienteRepository clienteRepository;

	
	public void generar(String cedulaCliente, List<ItemTO> detalle) {
		// TODO Auto-generated method stub
		Cliente cliente = this.clienteRepository.buscar(cedulaCliente);
		
		
		Factura miFactura = new Factura();
		
	    miFactura.setCliente(null);
	
	   this.facturaRepository .insertar(miFactura);
		}
}
