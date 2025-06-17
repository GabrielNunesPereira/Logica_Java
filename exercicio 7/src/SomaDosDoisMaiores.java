import java.util.Scanner;

public class SomaDosDoisMaiores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos 3 valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double soma;

        // Lógica para encontrar os dois maiores e somá-los
        if (valor1 < valor2 && valor1 < valor3) {
            // valor1 é o menor
            soma = valor2 + valor3;
        } else if (valor2 < valor1 && valor2 < valor3) {
            // valor2 é o menor
            soma = valor1 + valor3;
        } else {
            // valor3 é o menor
            soma = valor1 + valor2;
        }

        // Exibe a soma dos dois maiores
        System.out.println("A soma dos dois maiores valores é: " + soma);

        scanner.close();
    }
}
