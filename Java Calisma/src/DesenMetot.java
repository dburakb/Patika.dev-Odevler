import java.util.Scanner;

public class DesenMetot {
    static int i = 1;
    static void desen(int a) {
        int result, b;
        result = a;
        b = a;
        if(b >= 0) {
            a -= 5;
            b -= 5;
        }
        System.out.print(a + " ");
        if(b < 0) {
            return;
        }
        desen(a);
    }

    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı(pozitif): ");
        sayi = input.nextInt();

        desen(sayi);
    }
}
