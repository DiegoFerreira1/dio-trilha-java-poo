# 🧪 Testando Modificadores de Acesso em Java

Este projeto simples demonstra o uso dos modificadores de acesso em Java: `private`, *(default)*, `protected` e `public`, usando uma classe `ContaBancaria` e diferentes cenários de acesso.

---

## 🔐 Resumo dos Modificadores de Acesso

| Modificador     | Mesmo Pacote | Subclasse (Outro Pacote) | Classe Externa |
|-----------------|--------------|---------------------------|----------------|
| `private`       | ❌           | ❌                        | ❌             |
| *(default)*     | ✅           | ❌                        | ❌             |
| `protected`     | ✅           | ✅                        | ❌             |
| `public`        | ✅           | ✅                        | ✅             |

---

## 📄 Classe Principal: ContaBancaria.java

```java
// pacoteoriginal/ContaBancaria.java
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
```

## 🧪 Teste no Mesmo Pacote
```java
// pacoteoriginal/TesteMesmoPacote.java
public class TesteMesmoPacote {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1500.0, "1234", "987654");

        // System.out.println(conta.titular); // ERRO - private
        System.out.println(conta.saldo);       // OK - protected
        System.out.println(conta.agencia);     // OK - default
        System.out.println(conta.numeroConta); // OK - public

        conta.mostrarInformacoes();            // OK - método public
    }
}
```

## 🔄 Subclasse em Outro Pacote
```java
// outrospacotes/ContaPoupanca.java
import pacoteoriginal.ContaBancaria;

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
```

