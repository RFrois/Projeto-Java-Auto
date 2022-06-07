package com.projeto.estudo.java.autocenter;

import java.util.List;

public class OrdemServico {

	private String tipo;
	private String servico;
	private Double valorServico;
	private List<Pecas> pecas;
	private Double valorTotal = 0d;
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getTipo() {
		return tipo;
	}
	public List<Pecas> getPecas() {
		return pecas;
	}
	public void setPecas(List<Pecas> pecas) {
		this.pecas = pecas;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public Double getValorServico() {
		return valorServico;
	}
	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}
//	public Double getValorTotal() {
//	
//		Double valorTotal = valor + valorServico;
//		return valorTotal;
//	}
//	public void setValorTotal(Double valorTotal) {
//	}
	
	
}
