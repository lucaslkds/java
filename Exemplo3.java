import java.util.Scanner;

public class Exemplo3 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número");
        numero = teclado.nextInt();
            
            if (numero == 0) {
                System.out.println("Nem negativo, nem positivo");
            }
            else {if (numero < 0) { 
                System.out.println("É negativo");
                }
                else {System.out.println("É positivo");
                }
            }
              
            
        }
}