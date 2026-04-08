// Classe Pessoa
public class Pessoa {
    
    // Atributos privados: só podem ser acessados diretamente dentro da própria classe
    private String nome;
    private int idade;

    // Método get para retornar o nome
    public String getNome() {
        return nome;
    }

    // Método set para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método get para retornar a idade
    public int getIdade() {
        return idade;
    }

    // Método set para definir a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método falar: imprime uma mensagem de apresentação no console
    public void falar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}