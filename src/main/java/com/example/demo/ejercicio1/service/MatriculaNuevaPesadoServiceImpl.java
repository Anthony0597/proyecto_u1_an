package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("pesado")
public class MatriculaNuevaPesadoServiceImpl implements IMatriculaNuevaService {

	@Override
	public BigDecimal generar(BigDecimal precio) {
		BigDecimal valor= null;
		System.out.println("Matriculado pesado");
		System.out.println("Calculo del descuento de 3000");
		return valor = precio.multiply(new BigDecimal(0.15));
	}

}
