import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1;
        double numero2;

        System.out.println("Digite o primeiro número:");
        numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo número:");
        numero2 = entrada.nextDouble();

        System.out.println("Adição: " + (numero1 + numero2));

        System.out.println("Subtração: " + (numero1 - numero2));

        System.out.println("Multiplicação: " + (numero1 * numero2));

        System.out.println("Divisão: " + (numero1 / numero2));
    }
}
