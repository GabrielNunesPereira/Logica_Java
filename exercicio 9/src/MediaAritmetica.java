import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[10]; // Vetor para armazenar os 10 valores
        double soma = 0;

        // Leitura dos 10 valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        // Exibição dos valores informados
        System.out.println("\nValores informados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
        }

        // Cálculo e exibição da média aritmética
        double media = soma / 10;
        System.out.println("\nMédia aritmética dos valores: " + media);

        scanner.close();
    }
}
