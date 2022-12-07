package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Override
	public List<Transferencia> buscarReporte() {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.buscarTodos();
	}

	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//ORIGEN
		//1. Buscar la cuenta origen
		CuentaBancaria origen = this.bancariaService.buscarPorNumero(numeroOrigen);
		//2. Consultar el saldo de la cuenta destino
		BigDecimal saldoOrigen = origen.getSaldo();
		//3. Operacion resta en el origen
		BigDecimal nuevoSaldo = saldoOrigen.subtract(monto);
		//4. Actualizacion cuenta origen
		origen.setSaldo(nuevoSaldo);
		this.bancariaService.actualizar(origen);
		
		
		//DESTINO
		//1. Buscar la cuenta destino
		CuentaBancaria destino = this.bancariaService.buscarPorNumero(numeroDestino);
		//2. Consultar el saldo de la cuenta destino
		BigDecimal saldoDestino = destino.getSaldo();
		//3. Operacion resta en el destino 
		BigDecimal nuevoSaldoD = saldoDestino.add(monto);
		//4. Actualizacion cuenta destino
		destino.setSaldo(nuevoSaldoD);
		this.bancariaService.actualizar(destino);
		
		Transferencia trans = new Transferencia();
		trans.setCuentaDestino(numeroDestino);
		trans.setCuentaOrigen(numeroOrigen);
		trans.setFecha(LocalDateTime.now());
		trans.setMonto(monto);
		trans.setNumero("123456");
		
		this.iTransferenciaRepository.insertar(trans);
	}

}
