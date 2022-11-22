package com.example.demo.herencia;

public class PacienteNinoH extends PacienteH{
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
