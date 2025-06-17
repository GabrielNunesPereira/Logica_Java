import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base maior: ");
        double baseMaior = sc.nextDouble();

        System.out.print("Digite a base menor: ");
        double baseMenor = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Área do Trapézio: " + area);

        sc.close();
    }
}