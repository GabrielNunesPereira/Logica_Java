import java.util.Scanner;

public class MediaSemestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double nota;

        // Leitura das 4 notas
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota da " + i + "ª avaliação: ");
            nota = scanner.nextDouble();
            soma += nota;
        }

        // Cálculo da média
        double media = soma / 4;

        // Exibição da média
        System.out.printf("Média do semestre: %.2f\n", media);

        // Verificação de aprovação
        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }

        scanner.close();
    }
}