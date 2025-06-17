import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos 3 valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        // Verificação do maior valor
        double maior;

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }

        // Exibe o maior valor
        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}
