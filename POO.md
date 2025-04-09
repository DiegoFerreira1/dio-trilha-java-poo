# Programação Orientada a Objetos

## Linguagens de alto e baixo nível
As linguagens de programação podem ser classificadas em dois tipos principais: linguagens de baixo nível e linguagens de alto nível. A principal diferença entre os dois tipos de linguagem é o nível de abstração que elas oferecem.

### Baixo nível
São as mais próximas do hardware do computador. Elas são compostas por instruções que são facilmente compreendidas pelo computador, mas que são difíceis para os humanos entenderem. Isso ocorre porque as linguagens de baixo nível são muito específicas e descrevem detalhes técnicos do hardware.

As linguagens de baixo nível são usadas principalmente em aplicações que exigem alto desempenho e controle preciso do hardware.

**Exemplos**
1. Linguagem de máquina

É a linguagem mais básica que um computador pode entender. Ela é composta por sequências de números binários que representam instruções de hardware.

2. Linguagem de montagem

É uma linguagem que é mais fácil de entender do que a linguagem de máquina. Ela usa mnemônicos, que são palavras ou abreviações para as instruções de hardware.

**Exemplo Hello Word em Assembly**

```assembly
; Exemplo de um Hello World em Assembly
; ld -m elf_i386 -s -o hello hello.o
section .text align=0

global _start

mensagem db 'Hello world', 0x0a

len equ $ - mensagem

_start:
    mov eax, 4 ;SYS_write
    mov ebx, 1 ;Número do file descriptor (1=stdout)
    mov ecx, mensagem ;Ponteiro para a string.
    mov edx, len ; tamanho da mensagem
    int 0x80

    mov eax, 1
    int 0x8
```

**Exemplo Hello Word em Python**
```python
    print ('Hello World')
```

### Alto nível
As linguagens de alto nível são mais abstratas e fáceis de entender para os humanos. Elas se concentram em conceitos de alto nível, como variáveis, loops e funções.

As linguagens de alto nível são usadas para a maioria das aplicações de programação. Elas são mais fáceis de aprender e usar do que as linguagens de baixo nível, e permitem que os programadores se concentrem no algoritmo do programa, deixando os detalhes técnicos para a linguagem de programação.

**Exemplos**
- Python
- Java
- C++
- JavaScript

### Programação Estruturada
A programação estruturada é um paradigma de programação que tem como objetivo melhorar a clareza, qualidade e diminuir o tempo de desenvolvimento de um programa de computador, utilizando sub-rotinas e três estruturas básicas: 
- sequência;
- seleção (if e switch);
- iteração (laços for e while).

Ela implementa algoritmos com estruturas sequenciais denominadas de procedimentos lineares, podendo afetar o valor das
variaveis de escopo local ou global em uma aplicação. Não é possivel abstrair elementos do mundo real como na orientada a objetos.

**Uso do GOTO** 
É considerado desnecessário e contra-produtivo o uso de **goto**, uma estrutura de controle que permite pular instruções incondicionalmente, o que pode gerar código espagueti, muito mais difícil de acompanhar e de manter, e é **fonte de numerosos erros de programação**.

**Vantagens**
- Os programas são mais fáceis de entender, podem ser lidos de forma sequencial e não há necessidade de localizar saltos de execução nas linhas dentro dos blocos de código para tentar entender a lógica interna.
- A estrutura do programa é clara, já que as instruções estão mais conectadas ou relacionadas entre si.
- O esforço necessário nas fases de testes e depuração é minimizado. A localização das falhas e erros do programa, e, com isso, sua detecção e correção, são facilitadas enormemente.
- Os custos de manutenção são reduzidos. Assim como na depuração, modificar ou estender programas fica mais fácil na fase de manutenção.
- Os programas são mais simples e rápidos de criar.
- O rendimento dos programadores também é otimizado.

**Linguagens de Programação Estruturada**

As linguagens de programação estruturada mais comuns são **C e Cobol**. 
Outras linguagens usam elementos de outros paradigmas fora a programação estruturada, como **PHP e Go**.

**Diferença entre programação estruturada e orientada a objetos**

Enquanto a programação estruturada é voltada a **procedimentos** e **funções** definidas pelo usuário, a programação orientada a objetos é voltada a **conceitos** como o de **classes** e de **herança**.


## Conceito de POO

Programação orientada a objetos (POO, ou OOP segundo as suas siglas em inglês) é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos.

[link](https://felipe-aguiar.gitbook.io/dio-java/gitbook/programacao-orientada-a-objetos/conceito-de-poo)

Como se trata de um contexto análogo ao mundo real, tudo no qual nos referimos são objetos.
### exemplo
- Conta bancária
- Aluno
- Veículo
- Transferência etc.

A programação orientada a objetos é bem requisitada no contexto das aplicações mais atuais no mercado devido a possibilidade de reutilização de código e a capacidade de representação do sistema ser muito mais próximo do mundo real.

Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como Os quatro pilares da orientação a objetos:

### 1. Encapsulamento
Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em métodos com finalidades específicas que complementa uma ação em nossa aplicação.

**Exemplo**

Ligar um veículo exige muitas etapas para a engenharia, mas o condutor só visualiza a ignição, dar a partida e a “magia” acontece.

### 2. Herança
Características e comportamentos comuns podem ser elevados e compartilhados através de uma hierarquia de objetos.

**Exemplo** 

Um Carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricação e métodos como acelerar, frear. Logo para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma classe Veiculo para que seja herdada por Carro e Motocicleta.

### 3. Abstração
É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.

**Exemplo**

Veículo determina duas ações como acelerar e frear, logo estes comportamentos deverão ser abstratos pois existem mais de uma maneira de se realizar a mesma operação. ver Polimorfismo.

### 4. Polimorfismo
São as inúmeras maneiras de se realizar uma mesma ação.

**Exemplo**

Veículo determina duas ações como acelerar e frear, primeiramente precisamos identificar se estaremos nos referindo a Carro ou Motocicleta para determinar a lógica de aceleração e frenagem dos respectivos veículos.


## Classes
Toda a estrutura de código na linguagem Java é distribuído em arquivos com extensão `.java` denominados de classe.

As classes existentes em nosso projeto serão composta por:

**Identificador, Características e Comportamentos.**

- **Classe** *(class)*: A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo.

- **Identificador** *(identity)*: Propósito existencial aos objetos que serão criados.

- **Características** *(states)*: Também conhecido como atributos ou propriedades, é toda informação que representa o estado do objeto.

- **Comportamentos** *(behavior)*: Também conhecido como ações ou métodos, é toda parte comportamental que um objeto dispõe.

- **Instanciar** *(new)*: É o ato de criar um objeto a partir de estrutura definida em uma classe.

![class](/img/classe.png)

Para ilustrar as etapas de desenvolvimento orientada a objetos em Java, iremos reproduzir a imagem acima em forma de código para explicar que primeiro criamos a estrutura correspondente para assim podermos cria-los com as características e possibilidade de realização de ações (comportamentos) como se fosse no "mundo real".

```java
// Criando a classe Student
// Com todas as características e compartamentos aplicados

public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Food food){
      //NOSSO CÓDIGO AQUI
    }
    void drinking(Eat eat){
      //NOSSO CÓDIGO AQUI
    }
    void running(){
      //NOSSO CÓDIGO AQUI
    }
}
```
**Criando objetos a partir da classe cirada**
```java
// Criando objetos a partir da classe Student

public class School {
    public static void main(String[] args) throws Exception {
      Student student1 = new Student();
      student1.name= "John";
      student1.age= 12;
      student1.color= Color.FAIR;
      student1.sex= Sex.MALE;

      Student student2 = new Student();
      student2.name= "Sophia";
      student2.age= 10;
      student2.color= Color.FAIR;
      student2.sex= Sex.FEMALE;

      Student student3 = new Student();
      student3.name= "Lily";
      student3.age= 11;
      student3.color= Color.DARK;
      student3.sex= Sex.FEMALE;
    }
}
```
> No exemplo acima, **NÃO** estruturamos a classe `Student` com o padrão **Java Beans** `getters` e `setters`.

Seguindo algumas convenções, as nossas classes são classificadas como:

- **Classe de modelo** *(model)*: classes que representem estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.

- **Classe de serviço** *(service)*: classes que contém regras de negócio e validação de nosso sistema.

- **Classe de repositório** *(repository)*: classes que contém uma integração com banco de dados.

- **Classe de controle** *(controller)*: classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http web ou webservices.

- **Classe utilitária** *(util)*: classe que contém recursos comuns à toda nossa aplicação.

![class2](/img/classe2.png)