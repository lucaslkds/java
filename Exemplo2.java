import java.util.Scanner;

public class Exemplo2 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        System.out.println("Você tem " + idade + " anos");
    }
}