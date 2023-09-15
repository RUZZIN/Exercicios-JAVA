package exercicios_beecrowd_part2;
import java.io.IOException;
import java.util.Scanner;
public class EX1115 {
     public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
    	int x, y;

		do {
			x= input.nextInt();
			y = input.nextInt();
			if ((x > 0) & (y > 0)) {
				System.out.println("primeiro");
			}
			else if ((x < 0) & (y > 0)) {
				System.out.println("segundo");
			}
			else if ((x < 0) & (y < 0)) {
				System.out.println("terceiro");
			}
			else if ((x > 0) & (y < 0)) {
				System.out.println("quarto");
			}
		} while ((x != 0) && (y != 0));
 
    }
}
