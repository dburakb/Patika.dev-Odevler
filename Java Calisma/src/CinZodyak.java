import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
        int dYil;

        Scanner input = new Scanner(System.in);

        System.out.println("\nÇin Zodyak'ı hesaplama programına hoş geldiniz!");
        System.out.print("\nDoğum yılınızı giriniz: ");
        dYil = input.nextInt();

        if ((dYil % 12) == 0){
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        }
        else if ((dYil % 12) == 1){
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }
        else if ((dYil % 12) == 2){
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }
        else if ((dYil % 12) == 3){
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        }
        else if ((dYil % 12) == 4){
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        }
        else if ((dYil % 12) == 5){
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        }
        else if ((dYil % 12) == 6){
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        }
        else if ((dYil % 12) == 7){
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }
        else if ((dYil % 12) == 8){
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }
        else if ((dYil % 12) == 9){
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        }
        else if ((dYil % 12) == 10){
            System.out.println("Çin Zodyağı Burcunuz: At");
        }
        else{
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }
    }
}
