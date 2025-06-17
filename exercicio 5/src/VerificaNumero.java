import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor ao usuário
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Verifica se o número é positivo, negativo ou neutro
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é neutro (zero).");
        }

        scanner.close();
    }
}