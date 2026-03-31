import java.util.*;

public class Exer2 {
    public static void main(String[] args) {
    
    int num;
    
    Scanner teclado = new Scanner(System.in);
    num=teclado.nextInt();
    
        while (true) { 
            do {
                System.out.print("\nDigite um numero (0 Finaliza).: ");
                num = tcl.nextInt();
            }while (num<0);
            if (num==0){
                break;
            }
            for(int i=0; i<=num; i=i+2){
                System.out.print(i + " ");
            }
    }
    }

}
