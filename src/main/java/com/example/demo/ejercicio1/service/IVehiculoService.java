package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import com.example.demo.ejercicio1.modelo.Vehiculo;

public interface IVehiculoService {
	public Vehiculo buscar(String placa);
	public void crear(Vehiculo vehiculo);
	public void borrar(String placa);
	public void modificar(Vehiculo vehiculo);
	public void actualizar(BigDecimal precio,String marca, String placa);
}
