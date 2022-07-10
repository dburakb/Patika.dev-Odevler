import java.util.Scanner;

public class BolumOrtalama {
    public static void main(String[] args) {
        int a, c=0, d=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        a = input.nextInt();

        for (int b=1; b<=a; b++){
            if (b%3==0 && b%4==0){
                d++;
                c+=b;
            }
        }
        System.out.println("Ortalaması: "+c/d);
    }
}
