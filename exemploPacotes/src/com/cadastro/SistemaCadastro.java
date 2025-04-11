package com.cadastro;

public class SistemaCadastro {
	
	public static void main(String[] args) {
		
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa();
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		marcos.setCpf("123456.45");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}