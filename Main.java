import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class Main {
    public static void main(String[] args) {
        
        // Cria o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Cria um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Pede o nome ao usuário
        System.out.print("Digite seu nome: ");
        pessoa.setNome(scanner.nextLine()); // Armazena o nome digitado no atributo nome

        // Pede a idade ao usuário
        System.out.print("Digite sua idade: ");
        pessoa.setIdade(scanner.nextInt()); // Armazena a idade digitada no atributo idade

        // Chama o método falar para mostrar a apresentação
        pessoa.falar();

        // Fecha o Scanner
        scanner.close();
    }
}