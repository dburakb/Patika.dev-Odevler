import java.util.Scanner;

public class VucutKitleİndeks {
    public static void main(String[] args) {
        double kilo, boy, vki;

        Scanner input = new Scanner(System.in);

        System.out.println("\nVücut Kitle İndeksi hesaplama programına hoş geldiniz!\n");

        System.out.print("Lütfen kilonuzu kilogram cinsinden yazınız: ");
        kilo = input.nextDouble();
        System.out.print("Lütfen boyunuzu metre cinsinden yazınız: ");
        boy = input.nextDouble();

        vki = kilo / boy * boy;

        System.out.println("\nVücut kitle indeksiniz: " + vki);
    }
}
