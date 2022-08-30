import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int sayi1, sayi2, secim, i=1, ebob=0, ekok;

        Scanner input = new Scanner(System.in);

        System.out.print("\n1. sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("\n2. sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.print("\n1-EBOB\n2-EKOK\nLütfen yapmak istediğiniz işlemi seçiniz: ");
        secim = input.nextInt();

        while (i < Math.min(sayi1,sayi2)) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = (sayi1 * sayi2) / ebob;

        if (secim == 1) {
            System.out.println("\nEBOB: " + ebob);
        }
        else if (secim == 2) {
            System.out.println("\nEKOK: " + ekok);
        }
        else {
            System.out.println("\nSeçim hatası!");
        }
    }
}
