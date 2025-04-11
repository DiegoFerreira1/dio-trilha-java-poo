package conta.poupanca;

import conta.bancaria.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldo, String agencia, String numeroConta) {
        super(titular, saldo, agencia, numeroConta);
    }

    public void mostrarSaldo() {
        // System.out.println(titular); // ERRO - private
        System.out.println(saldo);       // OK - protected
        // System.out.println(agencia);  // ERRO - default fora do pacote
        System.out.println(numeroConta); // OK - public
    }
}