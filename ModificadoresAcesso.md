# Modificadores de acesso ou Visibilidade dos recursos

## Modificadores
Em java, utilizamos três palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir os quatro tipos de visibilidade de **atributos** e **métodos** e até mesmo **classes** no que se refere ao acesso por outras classes.

> **public**: Acessível em qualquer lugar.

> **private**: Acessível apenas na própria classe.

> **protected**: Acessível na própria classe, no pacote e em subclasses.

> **default**: Acessível apenas dentro do pacote.


Os **modificadores de acesso** controlam a visibilidade e o acesso a classes, métodos e variáveis em Java. Existem **quatro modificadores principais**:

### 1. `public`
- **Acessibilidade:** Público, qualquer classe pode acessar.
- **Aplicação:** Pode ser usado em classes, métodos, variáveis e construtores.
- **Exemplo:**
```java
  public class Carro {
      public int velocidade;
  }
```

### 2. `private`
- **Acessibilidade:** Acesso restrito à própria classe.
- **Aplicação:** Geralmente usado para variáveis e métodos. Não pode ser acessado fora da classe.
- **Exemplo:**
```java
class Carro {
    private int velocidade;
    private void acelerar() {
        velocidade += 10;
    }
}
```

### 2. `protected`
- **Acessibilidade:** Acessível na própria classe, nas classes do mesmo pacote e nas subclasses (mesmo que em pacotes diferentes).
- **Exemplo:**
```java
class Carro {
    protected int velocidade;
}

```

### 2. `protected`
- **Acessibilidade:** Acessível apenas dentro do mesmo pacote
- **Aplicação:** Quando você não especifica nenhum modificador, o acesso é restrito ao pacote.
- **Exemplo:**
```java
class Carro {
    int velocidade;  // default: acessível apenas no mesmo pacote
}
```
> Esses modificadores são usados para **encapsulamento**, que é um dos pilares da orientação a objetos, permitindo controlar como os dados e comportamentos de uma classe são acessados.

![modificadores](/img/modificadores.png)
