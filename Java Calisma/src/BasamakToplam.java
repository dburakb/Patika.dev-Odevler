import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        int a, b=0;

        Scanner input = new Scanner(System.in);

        System.out.print("\nSayıyı giriniz: ");
        a = input.nextInt();

        while (a > 0) {
            b = (a % 10) + b;
            a /= 10;
        }

        System.out.println("\nBasamak sayıları toplamı: " + b);
    }
}
