import java.util.Scanner;

public class AreaParalelogramo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        System.out.println("Área do Paralelogramo: " + area);

        sc.close();
    }
}