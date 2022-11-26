package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.herencia.CitaMedicaH;
import com.example.demo.spring.boot.*;

@SpringBootApplication
public class ProyectoU1AnApplication implements CommandLineRunner{
	
	@Autowired
	private PacienteTerceraEdadSB pacienteTESB;
	@Autowired
	private PacienteCancerSB cancerSB;
	@Autowired
	private CitaMedicaSB cita;
	@Autowired
	private MedicoSB medico;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring boot");
		pacienteTESB.setCodigoIESS("14351asd");
		pacienteTESB.setCedula("5165451");
		pacienteTESB.setNombre("Manuel");
		pacienteTESB.setTipo("TE");
		
		cancerSB.setCedula("4513212");
		cancerSB.setNombre("Daniel");
		cancerSB.setTipo("C");
		
		medico.setCedula("24251468");
		medico.setNombre("Maria");
		
		System.out.println(medico);
		System.out.println(cancerSB);
		
		cita.agendar(medico, cancerSB, "123123", LocalDateTime.of(2022, 12, 2, 8, 30));
		
	}

}
