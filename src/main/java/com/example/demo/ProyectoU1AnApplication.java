package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;
import com.example.demo.herencia.CitaMedicaH;
import com.example.demo.spring.boot.*;

@SpringBootApplication
public class ProyectoU1AnApplication implements CommandLineRunner{
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumero("0001");
		cuenta1.setTipo("A");
		cuenta1.setTitular("Maria Solano");
		cuenta1.setSaldo(new BigDecimal(100));
		this.bancariaService.insertar(cuenta1);
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("0002");
		cuenta2.setTipo("A");
		cuenta2.setTitular("Juan Paredes");
		cuenta2.setSaldo(new BigDecimal(230));
		this.bancariaService.insertar(cuenta2);
		
		System.out.println("Saldos actuales: ");
		CuentaBancaria cuentaActual1 = this.bancariaService.buscarPorNumero("0001");
		CuentaBancaria cuentaActual2 = this.bancariaService.buscarPorNumero("0002");
		System.out.println("Saldo actual : "+ cuentaActual1.getSaldo());
		System.out.println("Saldo actual : "+ cuentaActual2.getSaldo());
		
		System.out.println("Reporte 1");
		for(Transferencia t : this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		this.iTransferenciaService.realizar(cuenta1.getNumero(), cuenta2.getNumero(), new BigDecimal(10));
		System.out.println("Reporte 2");
		for(Transferencia t : this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		
		System.out.println("Saldos nuevos: ");
		CuentaBancaria cuentaConsultada1 = this.bancariaService.buscarPorNumero("0001");
		CuentaBancaria cuentaConsultada2 = this.bancariaService.buscarPorNumero("0002");
		System.out.println("Nuevo saldo : "+ cuentaConsultada1.getSaldo());
		System.out.println("Nuevo saldo : "+ cuentaConsultada2.getSaldo());
	}

}
