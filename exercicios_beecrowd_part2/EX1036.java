package exercicios_beecrowd_part2;

import java.io.IOException;
import java.util.Scanner;

public class EX1036 {
    public static void main(String[] args) throws IOException {
 
       Scanner ler = new Scanner(System.in);

            double A = ler.nextDouble();
            double B = ler.nextDouble();
            double C = ler.nextDouble();
            double r1 = 0;
            double r2 = 0;
            
            double delta = (B * B) - (4 * A * C);
            
            if(A == 0 || delta < 0) {
                System.out.println("Impossivel calcular");
            } else {
                r1 = (-B + Math.sqrt(delta)) / (2 * A);
                r2 = (-B - Math.sqrt(delta)) / (2 * A);
                
                System.out.printf("R1 = %.5f\n",r1);  
                System.out.printf("R2 = %.5f\n",r2);
            }
    }
}
