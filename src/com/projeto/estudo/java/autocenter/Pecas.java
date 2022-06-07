package com.projeto.estudo.java.autocenter;

public class Pecas {

	private String peca;
	private Integer quantidade;
	private Double valorUnitario;
	private Integer idPeca;
	
//	Pecas(Integer idPeca, String peca, Double valorUnitario){
//		this.idPeca = idPeca;
//		this.peca = peca;
//		this.valorUnitario = valorUnitario;
//	}
	public Integer getIdPeca() {
		return idPeca;
	}
	public void setIdPeca(Integer idPeca) {
		this.idPeca = idPeca;
	}
	public String getPeca() {
		return peca;
	}
	public void setPeca(String peca) {
		this.peca = peca;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public Double getValor() {
		
		Double multValor = getQuantidade() * getValorUnitario();
		return multValor;
	}
	public void setValor(Double valor) {
	}
}
