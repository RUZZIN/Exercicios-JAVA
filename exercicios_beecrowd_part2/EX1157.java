package exercicios_beecrowd_part2;
import java.io.IOException;
import java.util.Scanner;
public class EX1157 {
     public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.println(i);
        }
    }
}
