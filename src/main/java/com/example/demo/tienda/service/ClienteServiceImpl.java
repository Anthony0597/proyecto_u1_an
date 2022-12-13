package com.example.demo.tienda.service;

import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	private IClienteRepository clienteRepository;
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepository.insertar(cliente);
	}

}
