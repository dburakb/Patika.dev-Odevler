import java.util.Scanner;

public class EManav {
    public static void main(String[] args) {
        int kilo;
        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlıcan = 5.00, tutar, bakiye;

        Scanner input = new Scanner(System.in);

        System.out.println("\n E-Manav'a hoş geldiniz!");
        System.out.println("Ürünlerimizin fiyatları şu şekildedir: ");

        System.out.println("Armut: " + armut);
        System.out.println("Elma: " + elma);
        System.out.println("Domates: " + domates);
        System.out.println("Muz: " + muz);
        System.out.println("Patlıcan: " + patlıcan);

        System.out.print("\nLütfen bakiyenizi(TL) giriniz: ");
        bakiye = input.nextDouble();

        System.out.print("\nArmut kaç kilo: ");
        kilo = input.nextInt();
        tutar = kilo * armut;
        System.out.print("Elma kaç kilo: ");
        kilo = input.nextInt();
        tutar += kilo * elma;
        System.out.print("Domates kaç kilo: ");
        kilo = input.nextInt();
        tutar += kilo * domates;
        System.out.print("Muz kaç kilo: ");
        kilo = input.nextInt();
        tutar += kilo * muz;
        System.out.print("Patlıcan kaç kilo: ");
        kilo = input.nextInt();
        tutar += kilo * patlıcan;

        bakiye -= tutar;

        System.out.println("\nToplam tutar: " + tutar);
        System.out.println("Kalan bakiye: " + bakiye);
    }
}
