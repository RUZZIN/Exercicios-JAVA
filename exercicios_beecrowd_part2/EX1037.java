package exercicios_beecrowd_part2;
import java.io.IOException;
import java.util.Scanner;
public class EX1037 {
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);

            double number = ler.nextDouble();
            
           if(number >= 0 && number <= 25) {
                System.out.println("Intervalo [0,25]");
            } else if(number > 25 && number <= 50) {
                System.out.println("Intervalo (25,50]");
            } else if(number > 50 && number <= 75) {
                System.out.println("Intervalo (50,75]");
            } else if(number > 75 && number <= 100) {
                System.out.println("Intervalo (75,100]");
            } else {
                System.out.println("Fora de intervalo");
            } 
 
    }
}
