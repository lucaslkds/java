import java.util.Scanner;

import javax.xml.validation.Schema;

public @interface notas {

// byte	Stores whole numbers from -128 to 127
// short	Stores whole numbers from -32,768 to 32,767
// int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
// boolean	Stores true or false values
// char	Stores a single character/letter or ASCII values
// String

// -    Classe é um modelo de objeto - pode ter atributos e metodos 
//      Modelo - já traz os metedos
//      Objeto
//      Metodos

//  While - you normally don't know how many times, the system will do it
//  For - you define how many times will happen before
//  for while - he will be used at least one. The logical test is in the end of the code.
//  JVM (java virtual machine)
//  class always with Uppercase
//  Need be at least one function called "main"

public static void main (string][] args)

// print - println - 
// Criar uma variavel dentro da classe scanner
// para isso usamos um contrutor de objetos Exemplo abaixo

Scanner sc = new Scanner(System.ln): String nome = sc.nextLine()
// é um objeto da classe scanner (controla o teclado)


//Java consideram ponto "." como separador decimal


// || é ou em um if (esse || aquele)
// && and
// ! Not
// ^ XOR
// == equal
// != diference


// FOR - While - Dowhile
// Importante fechar o teclado



opc = Character.toUpperCase(tcl.next().charAt(0));
//pegar um caracter maiusculo ou minusculo


        } while (nome.isBlank());
//impedir que fique sen nada

            qtdNumeros++;
            somaNumeros += numero;
//soma de todos que entram pelo while, dentro do while e soma geral


     if (numero%2==0)
// par check


/* In Java, return is used to finish a method.

public static int soma(int a, int b) {
    return a + b;
}
public static void verificar(int n) {
    if (n < 0) {
        System.out.println("Numero invalido");
        return;
    }

    System.out.println("Numero valido");
}
*/

        if (s.isBlank() || s.isEmpty() || s.length()<3) {
            retorno = false;
// valida o nome com mais regras



        switch (op) {
            case '+':
                resultado = calc.somar(n1, n2);
                break;
            case '-':
                resultado = calc.subtrair(n1, n2);
                break;
            case '*':
                resultado = calc.multiplicar(n1, n2);
                break;
            case '/':
                resultado = calc.dividir(n1, n2);
                break;
            default:
                System.out.println("Operador inválido!");
                tcl.close();
                return;

// calculadora



Atributos privados
gets and sets privados

private class

        public void set idtipo ();
        this.idtipo(id tipo do objeto) = idtipo;


        public id idtipo();
        
classe veiculo
classe Motorista todo Motorista tem um veiculo
classe Appmotorista que usar as duas outras
deixar os atributos private
get e set public
usar ambos

notas

1°prova A2 é uma prova de conceito
20% muito fracil
30% dificil
50% é de acordo com a aula

2° prova é de programação
A2 em grupo para falar do codigo
indice de eficacia de resposta do professor
de 0 a 1


Abstração - é qualquer um entender o programa, deixar o mais simples para isso
é deixar perto da ideia de como vai fazer. o como vai ser dentro da classe, mas a ideia fica na chamada da classe
abstrair a ideia do projeto e aplicar a classe.

Encapsulamento - Proteger os dados dentro de um objeto, permitindo acessalo apenas por métodos especificos
é a idea de deixar classes específicas para trabalhar em problemas especificos do programa e não ter funções soltas

Herança - permite criar novas classes a partir de uma já existente, não podendo interagir entre herança e herdado

polimórfismo - Permite quee objetos de diferentes classes sejam tratados como objetos da mesma forma
Exemplo do mecanico que a classe principal tem um metodo que pode ser override pelas classes filhos
Para uma mesma classe podemos ter vários contrutores, mas todos eles tem o nome da classe 

Vantagens
Reutilização de código
Facilita a manutenção e escalabilidade
Melhor modelagem de problemas do mundo real

contrutor tem o mesmo nome da Classe

Explicando o construtor

public carro(String modelo, String cor) // aqui ele separa espaço na memoria
            this.modelo = modelo;       // aqui o primeir é a classe, a que foi reservado e aplica oq está em outro código. e o segundo é oq vai ser atribuido
            this.cor = cor;             // aqui o primeir é a classe e o segundo é oq vai ser atribuido

private - ninguem acessa
protect - somente as classes filhos acessam e modificam
public  - todas as classes acessam e modificam 

O java disponbiliza um construtor para cada classe
se não instanciarmos ele fica como padrão
new.nome_da_classe()



Injeção de código
O java ajuda com alguns erros e corrige por conta
como uma variavel string+int se tornar somente uma string
tostring - função utilizada para tranformar a variavel em String



prova

Diferença de public, private e protect

private - ninguem acessa
protect - somente as classes filhos acessam e modificam
public  - todas as classes acessam e modificam

Definição de polimórfismo, herença, Abstração e Encapsulamento

Override

Herança, precisamos instaciar a super classe para instaciar a sub classe
podemos escrever super(modelo) - 

2 tipos de polimórfismo
estatico ou Sobrecarga (metodos com o mesmo nome na mesma classe, mas com assinaturas diferentes) e

direto, dinamico ou sobrescrita (override de uma classe pai ou do próprio Java)
polimórfismo dinamico é uma forma de abstrair, ao inves de ter 2 metodos quase identicos, vale a pena usar o polimórfismo

Diagrama de classes
UML
Criação e interação de classes
Apresenta uma visão estatica dos objetos

defict 
defict cognitivo

+ public - todos acessam
# protect - ela e as filhas
- private - somente ela

principais tipos de relacionamentos de classes

associação - cliente e dvd alugado

agregação/composição - ex uma classe time composta de atletas - necessidade de agregação de outra classe - receita com os ingredientes

Herança - veiculo e classes filhas que são mais especialista (motos, carros, onibus)

Depedencia - uma classe que depende de outra para aplicar seus metodos

Especiaização/generalização - classes mae e filhas

objetos se comunicam por metodos e atributos
um atributo pode ser uma classe, já que a classe é um tipo de dados

Associação binaria

cardinalidade (multiplicidade)
0 - 1 - CPF 
1 - 1 - pessoa para documento
0 - * - pessoa e mais de um endereço
1 - * - cliente pedidos
3 - 5 - casos muito especificos

principio de callback em software


