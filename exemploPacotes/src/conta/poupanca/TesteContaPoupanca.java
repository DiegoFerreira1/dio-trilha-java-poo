package conta.poupanca;


public class TesteContaPoupanca {
 public static void main(String[] args) {
     ContaPoupanca cp = new ContaPoupanca("Maria", 2500.0, "5678", "112233");

     // Chamada de método da subclasse
     cp.mostrarSaldo();

     // Chamando método público herdado da superclasse
     cp.mostrarInformacoes();
 }
}
