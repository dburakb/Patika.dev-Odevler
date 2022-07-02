import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int acilis = 10, min = 20;
        double bas = 2.20, toplam, toplamNormal, km;

        Scanner input = new Scanner(System.in);

        System.out.println("Taksimetre ücret hesaplama programına hoş geldiniz!\n");

        System.out.print("Gittiğiniz km: ");
        km = input.nextDouble();

        toplamNormal = acilis + km * bas;

        toplam = toplamNormal > min ? toplamNormal : min;

        System.out.println("\nÖdenecek ücret: " + toplam);
    }
}
