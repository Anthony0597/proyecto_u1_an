package com.example.demo.herencia;

public class PacienteCancerH extends PacienteH{
	
	@Override
	public Integer calcularDescuento() {
		System.out.println("Paciente con el 30% descuento");
		return 30;
	}
}
