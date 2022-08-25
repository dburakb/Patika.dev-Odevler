import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int n;
        double sonuc=0.0, i;

        Scanner input = new Scanner(System.in);

        System.out.print("\nN sayısını giriniz: ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            sonuc += (1/i);
        }

        System.out.println("N'in harmonik sayısı: " + sonuc);
    }
}
