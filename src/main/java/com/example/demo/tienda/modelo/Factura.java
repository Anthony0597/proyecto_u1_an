package com.example.demo.tienda.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Factura {
	private String numero;
	private LocalDateTime fecha;
	private Cliente cliente;
	private List <Detalle> detalles;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;
	
	//GET Y SET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public BigDecimal getIva() {
		return iva;
	}
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", detalles=" + detalles
				+ ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + "]";
	}
	
	
}
