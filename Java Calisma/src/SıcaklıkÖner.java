import java.util.Scanner;

public class SıcaklıkÖner {
    public static void main(String[] args) {
        double sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.println("\nHava sıcaklığına göre etkinlik önerme programına hoş geldiniz!");
        System.out.print("\nHava sıcaklığını (derece) giriniz: ");
        sicaklik = input.nextDouble();
        if (sicaklik<5){
            System.out.println("\nKayak yapabilirsiniz.");
        } else if (sicaklik<10) {
            System.out.println("\nSinemaya gidebilirsiniz.");
        } else if (sicaklik<15) {
            System.out.println("\nİster sinemaya gidebilir, ister piknik yapabilirsiniz.");
        } else if (sicaklik<25) {
            System.out.println("\nPiknik yapabilirsiniz.");
        }
        else {
            System.out.println("\nYüzmeye gidebilirsiniz.");
        }
    }
}
