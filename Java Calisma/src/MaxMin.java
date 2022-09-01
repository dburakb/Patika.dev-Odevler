import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int olcum, sayi, n, min = 0, max = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("\nKaç tane sayı gireceksiniz: ");
        olcum = input.nextInt();

        for (n = 1; n <= olcum; n++) {
            System.out.print(n+". sayıyı giriniz: ");
            sayi = input.nextInt();

            if (n == 1) {
                min = sayi;
                max = sayi;
            }

            if (sayi > max) {
                max = sayi;
            }

            if (sayi < min) {
                min = sayi;
            }
        }

        System.out.println("En küçük değer: " + min);
        System.out.println("En büyük değer: " + max);

    }
}
