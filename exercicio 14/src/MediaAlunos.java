import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprovados = 0;
        String resposta;

        do {
            double soma = 0;

            // Leitura das 6 notas
            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                soma += nota;
            }

            double media = soma / 6;
            System.out.printf("Média final: %.2f\n", media);

            if (media >= 6.5) {
                System.out.println("Aluno aprovado!");
                aprovados++;
            } else {
                System.out.println("Aluno reprovado.");
            }

            // Consumir o Enter pendente
            scanner.nextLine();

            // Pergunta para calcular de outro aluno
            System.out.print("Calcular a média de outro aluno Sim/Não? ");
            resposta = scanner.nextLine().trim();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Quantidade de alunos aprovados: " + aprovados);

        scanner.close();
    }
}
