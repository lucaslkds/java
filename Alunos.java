public class Alunos {

    // definindo as variaveis
String nome;
String matricula;
double nota1;
double nota2;
double nota3;

// construtor

    public Alunos (String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

// método para calcular média
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }


// método para exibir status
    public void exibirStatus() {
        double media = calcularMedia();

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "2023001", 8.0, 7.5, 6.5);

        System.out.println("Média: " + aluno1.calcularMedia());
        aluno1.exibirStatus();
    }
}

}

}