package exercicios_beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class EX1009 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String nomeVendedor = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();
        double comissao = 0.15 * totalVendas;
        double totalReceber = salarioFixo + comissao;
        System.out.printf("TOTAL = R$ %.2f%n", totalReceber);
    }
}
