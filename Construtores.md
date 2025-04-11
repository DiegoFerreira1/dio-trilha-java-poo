# Construtores

A programação orientada a objetos (POO) é uma paradigma importantíssimo na construção de aplicações robustas e reutilizáveis. Em Java, uma das linguagens mais populares e amplamente utilizadas para POO, os construtores desempenham um papel crítico ao garantir que os objetos sejam inicializados corretamente antes de serem utilizados. Este artigo explora os conceitos fundamentais dos construtores em Java, abordando sua sintaxe, tipos e utilizações práticas, com o objetivo de proporcionar uma compreensão clara e aplicável.

## O Que São Construtores?
Um construtor em Java é um bloco de código especial dentro de uma classe, designado para inicializar novos objetos. Caracteriza-se por ter o mesmo nome da classe e por não especificar um tipo de retorno, nem mesmo void. Os construtores são chamados automaticamente quando um novo objeto é criado, facilitando a configuração inicial do objeto com valores específicos ou a execução de qualquer rotina preparatória necessária.

## Sintaxe e Características
A sintaxe de um construtor é semelhante à de um método comum, mas sem tipo de retorno. Por exemplo:
```java
public class Exemplo {
    // Construtor da classe Exemplo
    public Exemplo() {
        // Inicializações necessárias
    }
}
```

## Características principais:

- **Nome:** Deve coincidir exatamente com o nome da classe.
- **Retorno:** Não possui, nem mesmo void.
- **Acesso:** Pode ter qualquer modificador de acesso (public, private, etc.), controlando assim sua visibilidade.

## Tipos de Construtores
- **Construtor Padrão:** Se uma classe não possui construtores explicitamente definidos, o Java fornece um construtor padrão, sem argumentos, que não faz nada além de chamar o construtor da superclasse.
- **Construtor Parametrizado:** Permite que o desenvolvedor especifique um ou mais parâmetros, possibilitando a inicialização de objetos com diferentes estados.

### Exemplo Prático
Vejamos um exemplo com a classe Livro:
```java
public class Livro {
    String titulo;
    String autor;

    // Construtor parametrizado
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
```
No exemplo acima, o construtor `Livro` permite a criação de objetos com títulos e autores específicos, facilitando a inicialização e garantindo que cada objeto Livro seja criado com as informações essenciais.

## Importância dos Construtores
Os construtores são essenciais na POO por várias razões:

- **Inicialização Segura:** Garantem que todos os objetos de uma classe sejam inicializados em um estado consistente.
- **Flexibilidade:** A sobrecarga de construtores permite a inicialização de objetos de várias formas.
- **Encapsulamento:** Contribuem para o encapsulamento, permitindo a inicialização de atributos privados.

Os construtores são uma ferramenta poderosa em Java, oferecendo aos desenvolvedores controle preciso sobre como os objetos são inicializados, garantindo que estejam sempre em um estado válido. Ao compreender e utilizar efetivamente os construtores, é possível escrever código mais limpo, seguro e reutilizável, elevando a qualidade das aplicações Java desenvolvidas.

Sabemos que para criar um objeto na linguagem Java utilizamos a seguinte estrutura de código:

```java
Classe novoObjeto = new Classe();
```

Desta forma será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

Muitas das vezes já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto defina algumas propriedades essenciais. Abaixo iremos ilustrar uma classe Pessoa onde a mesma terá os atributos: Nome, CPF, Endereço.

```java
public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}
```

Criaremos uma Pessoa mas como não temos o setter para nome e cpf, este objeto não tem como receber estes valores.

```java
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa();
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
```
Entrando em cena o construtor para criar nossos objetos já com valores requeridos na momento da criação\instanciação (new).

```java
public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
	// o nome deverá ser igual ao nome da classe
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//...
	//getters
	//setters
}
```
Alterando o nosso sistema para agora criar o objeto com informações já requeridas conforme definição da ordem dos parâmetros do construtor.

```java
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
		
		//continua ...
		
	}
}
```

É considerado uma boa prática a criação do construtor vazio, este construtor vazio é utilizado por alguns frameworks em sua aplicação.

```java
public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
    //Mpetodo construtor vazio para instanciação sem parametros
    public Pessoa () {

	}
	// método construtor com parametros
	// o nome deverá ser igual ao nome da classe
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//...
	//getters
	//setters
}
```

Com o construtor vazio:

```java
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Diego")
        pessoa.setEndereco("RUA DAS MARIAS");
		
		//continua ...
		
	}
}
```

### Em resumo é bom manter um construtor padrão sem argumentos e outros com alguns argumentos relevantes