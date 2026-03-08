import java.util.Scanner;

public class Exemplo4 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int numero;
        System.out.println("Digite seu nome");
        nome = teclado.nextLine();
        System.out.println("Digite sua idade");
        numero = teclado.nextInt();
         
        while (numero > 0) {
                System.out.println(nome);                
                //numero--;
                 numero = numero -1;
        }
}
}