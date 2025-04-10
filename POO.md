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