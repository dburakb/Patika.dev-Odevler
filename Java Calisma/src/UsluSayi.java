import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int a=1,b=1,c,d=1;

        Scanner input = new Scanner(System.in);

        System.out.print("\nTabanı giriniz: ");
        a=input.nextInt();
        System.out.print("Üsü giriniz: ");
        b=input.nextInt();

        for (c=1;c<=b;c++){
            d*=a;
        }

        System.out.println("\nSonuç: "+d);
    }
}
