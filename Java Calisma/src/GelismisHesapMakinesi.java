import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int toplam(int a, int b) {
        int result = a + b;
        return result;
    }

    static int cikarma(int a, int b) {
        int result = a - b;
        return result;
    }

    static int carpma(int a, int b) {
        int result = a * b;
        return result;
    }

    static double bolme(int a, int b) {
        double result = a / b;
        return result;
    }

    static int usluSayi(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int faktoriyel(int a) {
        int result = 1;
        if (a == 0)
            return result;
        else {
            for (int i = a; i >= 1; i--) {
                result *= i;
            }
            return result;
        }
    }

    static int mod(int a, int b) {
        int result = a % b;
        return result;
    }

    static String dikdortgen(int a, int b) {
        int cevre = 2 * toplam(a,b);
        int alan = carpma(a,b);
        String result = "Çevre: " + cevre + "\nAlan: " + alan;
        return result;
    }

    public static void main(String[] args) {
        int secim = 1, sayi1, sayi2;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama (Girilen İlk Sayı İşleme Alınır)\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        Scanner input = new Scanner(System.in);

        System.out.println(menu);

        while(secim != 0) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            secim = input.nextInt();
            System.out.println("1. Sayıyı giriniz: ");
            sayi1 = input.nextInt();
            System.out.println("2. Sayıyı giriniz: ");
            sayi2 = input.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Toplam: " + toplam(sayi1,sayi2));
                    break;
                case 2:
                    System.out.println("Çıkarma: " + cikarma(sayi1,sayi2));
                    break;
                case 3:
                    System.out.println("Çarpma: " + carpma(sayi1,sayi2));
                    break;
                case 4:
                    System.out.println("Bölüm: " + bolme(sayi1,sayi2));
                    break;
                case 5:
                    System.out.println("Üslü Sayı Sonucu: " + usluSayi(sayi1,sayi2));
                    break;
                case 6:
                    System.out.println("Faktöriyel: " + faktoriyel(sayi1));
                    break;
                case 7:
                    System.out.println("Mod: " + mod(sayi1,sayi2));
                    break;
                case 8:
                    System.out.println(dikdortgen(sayi1,sayi2));
                    break;
                default:
                    System.out.println("İşlem hatası!");
                    break;
            }
        }
        System.out.println("Güle güle!");
    }
}
