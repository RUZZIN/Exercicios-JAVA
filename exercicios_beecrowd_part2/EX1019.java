package exercicios_beecrowd_part2;
import java.io.IOException;
import java.util.Scanner;
public class EX1019 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int segundos = scanner.nextInt();
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
    }
}
