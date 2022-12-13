package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	private static List <Cliente> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		baseDatos.add(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente cli = null;
		for (Cliente cb : baseDatos){
			if(cb.getCedula().equals(cliente.getCedula())) {
				cli=cb;
			}
		}
		baseDatos.remove(cli);
		baseDatos.add(cliente);
		System.out.println("Se actualiza el cliente: "+cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cliente = null;
		for (Cliente cb : baseDatos){
			if(cb.getCedula().equals(cedula)) {
				cliente=cb;
				return cliente;
			}
		}
		return null;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Cliente cliente = null;
		for (Cliente cb : baseDatos){
			if(cb.getCedula().equals(cedula)) {
				cliente=cb;
			}
		}
		baseDatos.remove(cliente);
	}

}
