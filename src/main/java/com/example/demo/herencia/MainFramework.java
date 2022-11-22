package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PacienteTerceraEdadH pacienteTEH = new PacienteTerceraEdadH();
		pacienteTEH.setCedula("125948");
		pacienteTEH.setCodigoIESS("51916");
		pacienteTEH.setNombre("Daniel");
		pacienteTEH.setTipo("TE");
		
		PacienteNinoH pacienteNH = new PacienteNinoH();
		pacienteNH.setCedula("125948");
		pacienteNH.setNombre("Daniel");
		pacienteNH.setPesoNacimiento(8);
		pacienteNH.setTipo("N");*/
		
		PacienteCancerH pacienteCH = new PacienteCancerH();
		pacienteCH.setCedula("125948");
		pacienteCH.setNombre("Daniel");
		pacienteCH.setTipo("C");
		
		MedicoH medico = new MedicoH();
		medico.setCedula("1354685");
		medico.setNombre("Diana");
		
		CitaMedicaH cita = new CitaMedicaH();
		cita.agendar(null, pacienteCH, "123123", LocalDateTime.of(2022, 12, 2, 8, 30));
	}

}
