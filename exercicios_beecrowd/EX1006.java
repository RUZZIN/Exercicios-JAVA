package exercicios_beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class EX1006 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;
        double media = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);
        System.out.printf("MEDIA = %.1f%n", media);
    }
}
