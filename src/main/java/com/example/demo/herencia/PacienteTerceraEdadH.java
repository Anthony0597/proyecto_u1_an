package com.example.demo.herencia;

public class PacienteTerceraEdadH extends PacienteH{
	private String codigoIESS;

	public String getCodigoIESS() {
		return codigoIESS;
	}

	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}
	
	@Override
	public Integer calcularDescuento() {
		System.out.println("Paciente con el 20% descuento");
		return 20;
	}
}
