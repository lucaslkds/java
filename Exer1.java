import java.util.*;

public class Exer1 {
    public static void main(String[] args) {
    
    String nome;
    int idade;
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite seu nome");
    nome = teclado.nextLine();
    System.out.println("Digite sua idade");
    idade = teclado.nextInt();

        while (idade > 0) {
                System.out.println(nome);                
                //Duas formas
                //numero--;
                 idade = idade -1;    
    

    }

}
}
