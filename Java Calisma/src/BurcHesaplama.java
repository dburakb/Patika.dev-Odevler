import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.println("\nBurcunuzu öğrenme programına hoş geldiniz!");
        System.out.print("Doğduğunuz ayı(sayı) giriniz: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü(ayın) giriniz: ");
        day = input.nextInt();

        if (month < 13 && month > 0 && day < 32 && day > 0){
            if (month == 1){
                if (day <= 21){
                    System.out.println("\nOğlak burcusunuz.");
                }
                else{
                    System.out.println("\nKova burcusunuz.");
                }
            }
            else if (month == 2){
                if (day <= 19){
                    System.out.println("\nKova burcusunuz.");
                }
                else{
                    System.out.println("\nBalık burcusunuz.");
                }
            }
            else if (month == 3){
                if (day <= 20){
                    System.out.println("\nBalık burcusunuz.");
                }
                else{
                    System.out.println("\nKoç burcusunuz.");
                }
            }
            else if (month == 4){
                if (day <= 20){
                    System.out.println("\nKoç burcusunuz.");
                }
                else{
                    System.out.println("\nBoğa burcusunuz.");
                }
            }
            else if (month == 5){
                if (day <= 21){
                    System.out.println("\nBoğa burcusunuz.");
                }
                else{
                    System.out.println("\nİkizler burcusunuz.");
                }
            }
            else if (month == 6){
                if (day <= 22){
                    System.out.println("\nİkizler burcusunuz.");
                }
                else{
                    System.out.println("\nYengeç burcusunuz.");
                }
            }
            else if (month == 7){
                if (day <= 22){
                    System.out.println("\nYengeç burcusunuz.");
                }
                else{
                    System.out.println("\nAslan burcusunuz.");
                }
            }
            else if (month == 8){
                if (day <= 22){
                    System.out.println("\nAslan burcusunuz.");
                }
                else{
                    System.out.println("\nBaşak burcusunuz.");
                }
            }
            else if (month == 9){
                if (day <= 22){
                    System.out.println("\nBaşak burcusunuz.");
                }
                else{
                    System.out.println("\nTerazi burcusunuz.");
                }
            }
            else if (month == 10){
                if (day <= 22){
                    System.out.println("\nTerazi burcusunuz.");
                }
                else{
                    System.out.println("\nAkrep burcusunuz.");
                }
            }
            else if (month == 11){
                if (day <= 21){
                    System.out.println("\nAkrep burcusunuz.");
                }
                else{
                    System.out.println("\nYay burcusunuz.");
                }
            }
            else{
                if (day <= 21){
                    System.out.println("\nYay burcusunuz.");
                }
                else{
                    System.out.println("\nOğlak burcusunuz.");
                }
            }
        }
        else {
            System.out.println("\nHatalı sayı giriş yaptınız.");
        }
    }
}
