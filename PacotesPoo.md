# Pacotes em POO

A linguagem Java é composta por milhares de classes com as finalidades de por exemplo:
- Classes de tipos de dados;
- Representação de texto, número, datas;
- Arquivos e diretórios;
- Conexão com o banco de dados;
- Entre diversas outras.

Por isso é importante diversificar os níveis de documentos, para facilitar a busca e manutenção.

Os pacotes são subdiretórios a partir da pasta src do projeto, onde estão localizadas as classes da linguagem e as novas criadas para o projeto.

## Em resumo

Pacotes em Java (ou *"packages"*) são um mecanismo para organizar e agrupar classes e interfaces relacionadas, proporcionando uma estrutura para o código. Eles ajudam a evitar conflitos de nomes e tornam o código mais modular e reutilizável.

Em POO (Programação Orientada a Objetos), pacotes facilitam a organização de diferentes partes do sistema, podendo ser divididos em:

1. **Pacotes padrão** *(built-in)*: São fornecidos pela linguagem, como java.util, java.io, etc. Contêm classes úteis que podem ser utilizadas em qualquer projeto Java.

2. **Pacotes personalizados** *(ou próprios)*: Criados pelos desenvolvedores para organizar suas próprias classes, como com.minhaempresa.projeto.

### Vantagens
- **Organização**: Facilita o gerenciamento do código.

- **Evita conflitos de nomes**: Classes com o mesmo nome podem existir em pacotes diferentes.

- **Controle de acesso:** Utilizando modificadores como public, protected, private, pode-se controlar a visibilidade das classes e seus membros dentro do pacote.

### Exemplo
```java
package com.exemplo;

public class Carro {
    private String modelo;
    private int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}
```
> Neste caso, a **classe Carro** pertence ao pacote **com.exemplo**. Para utilizá-la em outra classe, seria necessário importar o pacote correspondente.

![pacotes](/img/pacotes.png)

## Nomenclaturas de pacotes
Vamos imaginar que uma empresa se chama **Power Soft** e ela está desenvolvendo softwares comercial, governamental e um software livre ou de código aberto.

**Padrões sugeridos**
- **Comercial**: com.powersoft
- **Governamental**: gov.powersoft
- **Código aberto**: org.powersoft

Ainda podemos organizar mais um pouco as classes mediante a proposta de sua existência:

- **model**: Classes que representam a camada e o modelo da aplicação:
    - Cliente, Pedido, NotaFiscal, Usuario.
- **repository**: Classes ou Interfaces que possuem a finalidade de interagir com tabelas no banco de dados:
    - ClienteRepository.
- **service**: Classes que contém regras de negócio do sistema:
    - ClienteService possui o método validar CPF do cliente cadastrado.
- **controller**: Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP.
- **view**: Classes que possuem alguma integração com a interface gráfica acessada pelo usuário.
- **util**: Pacote que contém classes utilitárias do sistema:
    - FormatadorNumeroUtil, ValidadorUtil.

## Identificação
Uma característica de uma classe é a sua identificação:
- Cliente, NotaFiscal, TituloPagar

Porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (**próprio nome**) e agora o nome qualificado (**endereçamento do pacote + nome**).

**Exemplo**
Considere a classe Usuario que está endereãda no pacote com.controle.acesso.model, o nome desta classe é: `com.controle.acesso.model.Usuario`

### Package versus Import
A localização de uma classe é definida pela palavra reservada `package`, logo uma classe só tem uma definição de package no arquivo, sempre na primeira linha do código.

Para utilização de uma classe existente em outros pacotes, necessitamos realizar a importação das mesma, seguindo a recomendação abaixo:

```java
package

import ...
import ...

public class MinhaClasse{

}
```
