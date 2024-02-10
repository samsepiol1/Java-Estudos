<center><h2>Meus Estudos em Java</h2></center>
<p align="center"><a href="https://elixir.com" target="_blank"><img src="https://cdn.icon-icons.com/icons2/2699/PNG/512/java_logo_icon_168609.png" width="400" alt="Elixir Logo"></a></p>


A linguagem de programação Java é uma linguagem de programação de alto nível, orientada a objetos e multiplataforma. Foi criada pela Sun Microsystems (agora pertencente à Oracle Corporation) na década de 1990. Java é conhecida por sua portabilidade, o que significa que os programas escritos em Java podem ser executados em qualquer dispositivo que tenha um interpretador Java, conhecido como a Máquina Virtual Java (JVM).



## Imprimir mensagem na tela

O System.out.println é um método estático da classe System em Java, utilizado para imprimir mensagens no console. Funciona da seguinte maneira:

System: é uma classe do pacote java.lang, que contém métodos e propriedades para interagir com o ambiente de tempo de execução do sistema.
out: é um objeto da classe PrintStream, que representa a saída padrão do sistema (normalmente o console).
println: é um método de PrintStream que imprime uma string e move o cursor para a próxima linha.
Quando você chama System.out.println("mensagem"), você está usando o método println do objeto out da classe System para imprimir a mensagem no console, seguida por uma nova linha.


```java
package exemplo;

public class ExemploOlaMundo{
  public static void main(String[] args){
  System.out.println("Olá Mundo!");
  }
}

```


Nesse exemplo do código temos uma classa ExemploOlaMundo com o método de imprimir uma mensagem na tela com public static void main

## Tipos de dados em Java 

Tipos Primitivos:

Inteiros: byte, short, int, long
Ponto flutuante: float, double
Caracteres: char
Booleano: boolean
Tipos de Referência:

Classes: String, Scanner, Random, etc.
Arrays: int[], String[], etc.
Interfaces: List, Map, Runnable, etc.

variaveis no java podem ser declaradas das seguintes formas

```java
double preco;
char inicial, letra;
double altura, peso, envergadura;
```

é possível, inclusive, declarar mais de uma variavel em apenas um linha separando os nomes por virgula e especificando qual o tipo da variavel


