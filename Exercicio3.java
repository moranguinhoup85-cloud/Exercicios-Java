import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorConta;
        int pessoas;
        double valorPorPessoa;

        System.out.println("Digite o valor total da conta:");
        valorConta = entrada.nextDouble();

        System.out.println("Digite a quantidade de pessoas:");
        pessoas = entrada.nextInt();

        valorPorPessoa = valorConta / pessoas;

        System.out.println("Cada pessoa deve pagar: R$ " + valorPorPessoa);
    }
}
