import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a diagonal maior: ");
        double dMaior = sc.nextDouble();

        System.out.print("Digite a diagonal menor: ");
        double dMenor = sc.nextDouble();

        double area = (dMaior * dMenor) / 2;
        System.out.println("Área do Losango: " + area);

        sc.close();
    }
}