import java.util.Scanner;

public class Calcule_area {

    public static void main(String [] args) {
        double _area = 0;
        double _raio = 0.0f;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o raio do circulo:");
        _raio = teclado.nextDouble();
        _area = Math.PI*Math.pow(_raio,2);
        System.out.printf("A área do da circunferência é: %.2f", _area);
    }

}







