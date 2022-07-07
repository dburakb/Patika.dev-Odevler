import java.util.Scanner;

public class KücüktenBüyüge {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("\n3 sayıyı küçükten büyüğe sıralama programına hoş geldiniz!");
        System.out.print("1. sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        c = input.nextInt();

        if (a<b && b<c){
            System.out.println("1. sayı < 2. sayı < 3.sayı");
        }
        else if (a<c && c<b){
            System.out.println("1. sayı < 3. sayı < 2.sayı");
        }
        else if (b<a && a<c){
            System.out.println("2. sayı < 1. sayı < 3.sayı");
        }
        else if (b<a && c<b){
            System.out.println("3. sayı < 2. sayı < 1.sayı");
        }
        else if (c<a && a<b){
            System.out.println("3. sayı < 1. sayı < 2.sayı");
        }
        else{
            System.out.println("2. sayı < 3. sayı < 1.sayı");
        }
    }
}
