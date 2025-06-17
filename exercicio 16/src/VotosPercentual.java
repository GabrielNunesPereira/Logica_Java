import java.util.Scanner;

public class VotosPercentual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores do município: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o percentual de votos brancos (ex: 10 para 10%): ");
        double percentualBrancos = scanner.nextDouble();

        System.out.print("Digite o percentual de votos válidos (ex: 70 para 70%): ");
        double percentualValidos = scanner.nextDouble();

        System.out.print("Digite o percentual de votos nulos (ex: 20 para 20%): ");
        double percentualNulos = scanner.nextDouble();

        // Calcula a quantidade de votos de cada categoria
        double votosBrancos = (percentualBrancos / 100) * totalEleitores;
        double votosValidos = (percentualValidos / 100) * totalEleitores;
        double votosNulos = (percentualNulos / 100) * totalEleitores;

        // Exibe os resultados
        System.out.printf("\nQuantidade de votos brancos: %.0f\n", votosBrancos);
        System.out.printf("Quantidade de votos válidos: %.0f\n", votosValidos);
        System.out.printf("Quantidade de votos nulos: %.0f\n", votosNulos);

        scanner.close();
    }
}
