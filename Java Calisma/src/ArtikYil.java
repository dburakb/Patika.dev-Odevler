import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.println("\nArtık yıl hesaplama programına hoş geldiniz!");
        System.out.print("\nYılı giriniz: ");
        yil = input.nextInt();

        if (yil % 4 == 0){
            if (yil % 100 == 0){
                if (yil % 400 == 0){
                    System.out.print("\n" + yil);
                    System.out.println(" bir artık yıldır.");
                }
                else{
                    System.out.print("\n" + yil);
                    System.out.println(" bir artık yıl değildir.");
                }
            }
            else{
                System.out.print("\n" + yil);
                System.out.println(" bir artık yıldır.");
            }
        }
        else{
            System.out.print("\n" + yil);
            System.out.println(" bir artık yıl değildir.");
        }
    }
}
