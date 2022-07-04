import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int islem;
        double s1, s2, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("\nHesap makinesine hoş geldiniz!");

        System.out.print("\n1. sayıyı giriniz: ");
        s1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz: ");
        s2 = input.nextDouble();

        System.out.println("\nİşlemi seçiniz:");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        islem = input.nextInt();

        switch (islem){
            case 1:
                sonuc = s1 + s2;
                System.out.println("\nSonuç: " + sonuc);
                break;
            case 2:
                sonuc = s1 - s2;
                System.out.println("\nSonuç: " + sonuc);
                break;
            case 3:
                sonuc = s1 * s2;
                System.out.println("\nSonuç: " + sonuc);
                break;
            case 4:
                sonuc = s1 / s2;
                System.out.println("\nSonuç: " + sonuc);
                break;
            default:
                System.out.println("Hatalı sayı girdiniz!");
                break;
        }
    }
}
