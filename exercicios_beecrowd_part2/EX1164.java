package exercicios_beecrowd_part2;
import java.io.IOException;
import java.util.Scanner;
public class EX1164 {
    public static void main(String[] args) throws IOException {
       Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, soma;
        for (int i = 0; i < N; i++) {
        	soma = 0;
        	X = leitor.nextInt();
        	for (int j = 1; j < X; j++) {
        		if (X % j == 0) soma += j;
        	}
        	if (soma == X) System.out.println(X + " eh perfeito");
        	else System.out.println(X + " nao eh perfeito");
        }
    }
}
