import java.util.Scanner;

public class RecursiveAsalSayi {
    static void asalSayi(int i, int k) {
        if(i == k) {
            System.out.println(i + " Asal sayıdır.");
            return;
        }
        else if((i % k) == 0) {
            System.out.println(i + " Asal sayı değildir.");
            return;
        }
        asalSayi(i,k+1);
    }

    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        asalSayi(sayi,2);
    }
}
