import java.util.Scanner;

public class DToplam {
    public static void main(String[] args) {
        int a, total=0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            a = input.nextInt();
            if (a%4==0){
                total += a;
            }
        }while (a%2==0);

        System.out.println("Toplam: " + total);
    }
}
