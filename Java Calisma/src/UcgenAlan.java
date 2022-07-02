import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3, cevre, u, alan;

        Scanner input = new Scanner(System.in);

        System.out.println("Üçgenin çevresi ve alanını hesaplama programına hoş geldiniz!\n");

        System.out.print("1. kenarın uzunluğunu giriniz: ");
        kenar1 = input.nextDouble();
        System.out.print("2. kenarın uzunluğunu giriniz: ");
        kenar2 = input.nextDouble();
        System.out.print("3. kenarın uzunluğunu giriniz: ");
        kenar3 = input.nextDouble();

        cevre = kenar1 + kenar2 + kenar3;
        u = cevre/2;
        alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println("\nÜçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
