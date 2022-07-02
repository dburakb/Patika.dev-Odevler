import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double para, kdv, sonFiyat, tutar, oran1, oran2;

        Scanner input = new Scanner(System.in);

        System.out.print("KDVli fiyatını öğrenmek istediğiniz ürünün KDVsiz fiyatını giriniz: ");
        para = input.nextInt();

        oran1 = 0.18;
        oran2 = 0.08;

        kdv = 0 < para && 1000 > para ? oran1 : oran2;

        tutar = para * kdv;
        sonFiyat = para + tutar;

        System.out.println("\nKDVsiz fiyat: " + para);
        System.out.println("Uygulanan KDV oranı: " + kdv);
        System.out.println("Uygulanan KDV tutarı" + tutar);
        System.out.println("KDVli fiyat: " + sonFiyat);
    }

}

