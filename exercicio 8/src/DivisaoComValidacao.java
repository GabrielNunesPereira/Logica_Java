import java.util.Scanner;

public class DivisaoComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do primeiro valor
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        double valor2;

        // Leitura do segundo valor com validação
        do {
            System.out.print("Digite o segundo valor (maior que zero): ");
            valor2 = scanner.nextDouble();

            if (valor2 <= 0) {
                System.out.println("Valor inválido! O segundo valor deve ser maior que zero.");
            }
        } while (valor2 <= 0);

        // Cálculo da divisão
        double resultado = valor1 / valor2;

        // Exibição do resultado
        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }
}
