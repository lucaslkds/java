import java.util.Scanner;

public class Nomes {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int numero;

        do {
        System.out.println("Digite seu nome");
        nome = teclado.nextLine();
        } while (nome.isEmpty());

        do {
            System.out.println("Digite sua idade");
            numero = teclado.nextInt();  
        }
        while (numero <= 0);
        int i = numero;
        
        do {
            System.out.println(i + nome);
            i = i -1; }         
            while (i > 0) ;
}
}
