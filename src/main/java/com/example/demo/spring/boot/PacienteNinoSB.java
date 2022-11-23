package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteNinoSB extends PacienteSB{
	private int pesoNacimiento;

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}

	@Override
	public Integer calcularDescuento() {
		System.out.println("Paciente Niño con el 10% descuento");
		return 10;
	}
	
	
}
