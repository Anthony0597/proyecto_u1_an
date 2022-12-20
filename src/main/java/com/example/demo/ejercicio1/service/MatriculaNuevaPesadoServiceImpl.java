package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service("pesado")
public class MatriculaNuevaPesadoServiceImpl implements IMatriculaNuevaService {

	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado pesado");
		System.out.println("Calculo del descuento de 3000");
	}

}
