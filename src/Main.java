import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tabuada de multiplicação. Escreva o número de 1 a 10:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for(int i = 0; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
