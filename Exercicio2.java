import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorProduto;
        int quantidade;
        double total;

        System.out.println("Digite o valor do produto:");
        valorProduto = entrada.nextDouble();

        System.out.println("Digite a quantidade:");
        quantidade = entrada.nextInt();

        total = valorProduto * quantidade;

        System.out.println("Valor total: R$ " + total);
    }
}
