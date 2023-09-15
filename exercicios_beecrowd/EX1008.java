package exercicios_beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class EX1008 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();
        double salario = horasTrabalhadas * valorPorHora;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}
