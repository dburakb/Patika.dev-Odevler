import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, i, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for (i = 1, toplam = 0; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        }
        else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
