import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int a, b=1, c, d, e=1, f, g=1, h, n, r;

        Scanner input = new Scanner(System.in);

        System.out.print("\nn'yi giriniz: ");
        n = input.nextInt();
        System.out.print("\nr'yi giriniz: ");
        r = input.nextInt();

        c=n-r;

        for (a=1; a<=n; a++){
            b*=a;
        }
        for (d=1; d<=r; d++){
            e*=d;
        }
        for (f=1; f<=c; f++){
            g*=f;
        }

        h=b/(e*g);

        System.out.println("\nKombinasyonu: "+h);
    }
}
