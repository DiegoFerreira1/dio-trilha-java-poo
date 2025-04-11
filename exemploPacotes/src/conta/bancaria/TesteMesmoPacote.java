package conta.bancaria;

// Teste no mesmo pacote: conta.bancaria

public class TesteMesmoPacote {
 public static void main(String[] args) {
     ContaBancaria conta = new ContaBancaria("João", 1500.0, "1234", "987654");

     // System.out.println(conta.titular); // ERRO - private
     System.out.println("Saldo protected: " + conta.saldo);       // OK - protected
     System.out.println("Agencia default: " + conta.agencia);     // OK - default
     System.out.println("NumeroConta public " + conta.numeroConta); // OK - public
     
     System.out.println("---------------------------------------------------------------");

     conta.mostrarInformacoes();            // OK - método public
 }
}