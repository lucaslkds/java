import java.util.Scanner;

public class Perguntacasado {

    public static void main(String [] args) {
        char resposta1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Você é casado? S/N:");
        resposta1 = teclado.next().charAt(0);
        
        if (resposta1=='S' || resposta1=='s' ) {
        System.out.println("Casado");
        }
        else {System.out.println("Solteiro");
        }
    }
}

// Perguntar o nome
// Definir que a resposta seja S ou N - Do While







