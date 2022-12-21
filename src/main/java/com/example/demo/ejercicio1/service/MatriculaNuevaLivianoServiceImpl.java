package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("liviano")
public class MatriculaNuevaLivianoServiceImpl implements IMatriculaNuevaService {

	@Override
	public BigDecimal generar(BigDecimal precio) {
		BigDecimal valor=null;
		System.out.println("Matriculado liviano");
		System.out.println("Calculo del descuento de 2000");
		return valor = precio.multiply(new BigDecimal(0.1));
	}

}
