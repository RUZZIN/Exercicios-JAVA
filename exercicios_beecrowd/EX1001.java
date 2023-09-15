package exercicios_beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class EX1001 {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int A = ler.nextInt();
        int B = ler.nextInt();
        int SOMA = A+B;
        System.out.println("X = "+SOMA);
    }
}