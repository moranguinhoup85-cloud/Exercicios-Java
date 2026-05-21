import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número:");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = entrada.nextInt();

        int soma = numero1 + numero2;

        System.out.println("Soma: " + soma);
    }
}
