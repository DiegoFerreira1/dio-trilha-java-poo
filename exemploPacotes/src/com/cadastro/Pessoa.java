package com.cadastro;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	//Construtor vazio para nao precisar de parametros na instanciação no main
	public Pessoa() {
		
	}
	//Construtor com parametros para instanciar objetos com informações previas como cpf e nome
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		nome = newNome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String newCpf) {
		cpf = newCpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	//...
	//setters de nome e cpf ?
}