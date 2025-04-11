package conta.bancaria;

// Pacote Original: conta.bancaria

public class ContaBancaria {
	 
	 private String titular;
	 
	 protected double saldo;
	 
	 String agencia;
	 
	 public String numeroConta;
	
	 public ContaBancaria(String titular, double saldo, String agencia, String numeroConta) {
	     this.titular = titular;
	     this.saldo = saldo;
	     this.agencia = agencia;
	     this.numeroConta = numeroConta;
	 }
	
	 private void mostrarTitular() {
	     System.out.println("Titular: " + titular);
	 }
	
	 public void mostrarInformacoes() {
	     mostrarTitular();
	     System.out.println("Saldo: " + saldo);
	     System.out.println("Agência: " + agencia);
	     System.out.println("Número da Conta: " + numeroConta);
	 }
}