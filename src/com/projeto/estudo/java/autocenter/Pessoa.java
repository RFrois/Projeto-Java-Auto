package com.projeto.estudo.java.autocenter;

import java.util.List;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private Integer idade;
	private String cpf;
	private List <Contato> contatos;
	private List <Endereco> endereco;
	private List <CarroModelo> carro;
	public List<CarroModelo> getCarro() {
		return carro;
	}
	public void setCarro(List<CarroModelo> carro) {
		this.carro = carro;
	}
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	public List<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
