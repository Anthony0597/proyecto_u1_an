package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteCancerSB extends PacienteSB{
	
	@Override
	public Integer calcularDescuento() {
		System.out.println("Paciente con el 30% descuento");
		return 30;
	}
	
	
}
