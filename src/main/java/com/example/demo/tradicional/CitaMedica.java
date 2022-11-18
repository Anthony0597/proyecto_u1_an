
package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {
	
private String numero;
private LocalDateTime fechaCita;
private LocalDateTime fechaAgenda;
private Medico medico;
private Paciente paciente;

public void agendar(String numero, LocalDateTime fechaCita, String nombreMedico, String cedulaMedico,
		String nombrePaciente, String cedulaPaciente, String tipo) {
	
	
	this.numero=numero;
	this.fechaCita=fechaCita;
	this.fechaAgenda=LocalDateTime.now();
	
	Medico medicoObjeto = new Medico();
	medicoObjeto.setCedula(cedulaMedico);
	medicoObjeto.setNombre(nombreMedico);	
	this.medico=medicoObjeto;
	
	
	//Paciente pacienteObjeto;
	
	//Tercera Edad es (TE), Ninio es (N)
	if(tipo.equals("TE")) {
		PacienteTerceraEdad pacienteTE = new PacienteTerceraEdad();
		pacienteTE.setCodigoIESS("15487");
		pacienteTE.setTipo("TE");
		this.paciente = pacienteTE; 
		System.out.println("Paciente con descuento");
	}else {
		PacienteNino pacienteN = new PacienteNino();
		pacienteN.setPesoNacimiento(5);
		pacienteN.setTipo("N");
		this.paciente = pacienteN;
		System.out.println("Paciente Niño sin descuento");
	}
	
	paciente.setCedula(cedulaPaciente);
	paciente.setNombre(nombrePaciente);
    this.guardarCita(this);
}


@Override
public String toString() {
	return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda + ", medico="
			+ medico + ", paciente=" + paciente + "]";
}



private void guardarCita(CitaMedica cita) {
	//Insertar en la base de datos, guardar cita
	System.out.println("se registró la cita: ");
	System.out.println(cita.toString());
}

//GET Y SET

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public LocalDateTime getFechaCita() {
	return fechaCita;
}

public void setFechaCita(LocalDateTime fechaCita) {
	this.fechaCita = fechaCita;
}

public LocalDateTime getFechaAgenda() {
	return fechaAgenda;
}

public void setFechaAgenda(LocalDateTime fechaAgenda) {
	this.fechaAgenda = fechaAgenda;
}

public Medico getMedico() {
	return medico;
}

public void setMedico(Medico medico) {
	this.medico = medico;
}

public Paciente getPaciente() {
	return paciente;
}

public void setPaciente(Paciente paciente) {
	this.paciente = paciente;
}
}
