package exercicios_beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class EX1007 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int diferenca = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + diferenca);
    }
}
