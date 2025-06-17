import java.util.Scanner;

public class MediaEntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dois números
        System.out.print("Digite o primeiro número (menor): ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número (maior): ");
        int num2 = scanner.nextInt();

        int soma = 0;
        int quantidade = 0;

        // Soma todos os números entre num1 e num2 (inclusive)
        for (int i = num1; i <= num2; i++) {
            soma += i;
            quantidade++;
        }

        // Calcula a média
        double media = (double) soma / quantidade;

        // Exibe os resultados
        System.out.println("Quantidade de números: " + quantidade);
        System.out.println("Soma dos números: " + soma);
        System.out.printf("Média aritmética: %.2f\n", media);

        scanner.close();
    }
}
