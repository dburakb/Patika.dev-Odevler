import java.util.Scanner;

public class RecursiveUsluSayi {
    static int result = 1;
    static int usluSayi(int a, int b) {
        if(b == 0) {
            return 1;
        }
        result *= a;
        usluSayi(a,b-1);
        return result;
    }

    public static void main(String[] args) {
        int us, taban, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban: ");
        taban = input.nextInt();
        System.out.print("Us: ");
        us = input.nextInt();

        sonuc = usluSayi(taban,us);
        System.out.println("Sonuç: " + sonuc);
    }
}
