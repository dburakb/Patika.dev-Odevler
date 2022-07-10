import java.util.Scanner;

public class UsBulma {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        a = input.nextInt();

        for (b=4, c=5; b<=a && c<=a;b*=4, c*=5){
            System.out.println(b);
            System.out.println(c);
        }
    }
}
