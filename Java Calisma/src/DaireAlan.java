import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double r, pi = 3.14, a, alan;

        Scanner input = new Scanner(System.in);

        System.out.println("\nDaire diliminin alanını hesaplama programına hoş geldiniz!\n");

        System.out.print("Alanını hesaplamak istediğiniz daire diliminin dairesinin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Alanını hesaplamak istediğiniz daire diliminin derecesini giriniz: ");
        a = input.nextDouble();

        alan = (pi * r * r * a) / 360;

        System.out.println("\nDaire diliminin dairesinin yarıçapı: " + r);
        System.out.println("Daire diliminin derecesi: "+ a);
        System.out.println("Daire diliminin alanı: " + alan);
    }
}
