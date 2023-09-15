package exercicios_beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class EX1010 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int codigoPeca1 = scanner.nextInt();
        int numeroPeca1 = scanner.nextInt();
        double valorUnitarioPeca1 = scanner.nextDouble();
        int codigoPeca2 = scanner.nextInt();
        int numeroPeca2 = scanner.nextInt();
        double valorUnitarioPeca2 = scanner.nextDouble();
        double totalPagar = (numeroPeca1 * valorUnitarioPeca1) + (numeroPeca2 * valorUnitarioPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);
    }
}
