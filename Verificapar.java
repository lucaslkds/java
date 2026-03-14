import java.util.Scanner;

public class Verificapar {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite Um Número");
            numero = teclado.nextInt();  
        }
        while (numero < 0);


        if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }

        

}
}
