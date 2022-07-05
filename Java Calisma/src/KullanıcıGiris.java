import java.util.Scanner;

public class KullanıcıGiris {
    public static void main(String[] args) {
        int secim;
        String userName, password, npassword;

        Scanner input = new Scanner(System.in);

        System.out.println("\nDB uygulamasına hoş geldiniz");
        System.out.print("\nKullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        Scanner inp = new Scanner(System.in);

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı!");
        }
        else if(userName.equals("patika")){
            System.out.print("\nŞifreniz yanlış.\nŞifrenizi sıfırlamak ister misiniz?\nEvet(1)\nHayır(2)\n");
            secim = input.nextInt();

            if (secim == 1){
                System.out.print("\nYeni şifrenizi giriniz: ");
                npassword = inp.nextLine();
                if (npassword.equals("java123")){
                    System.out.println("Yeni şifreniz eskisi ile aynı olamaz. Şifre oluşturulamadı.");
                }
                else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else if (secim == 2) {
                System.out.println("\nLütfen tekrar giriş yapınız.");
            }
            else{
                System.out.println("Hatalı rakam girildi.");
            }
        }
        else{
            System.out.println("\nKullanıcı adınız veya hem şifre hem kullanıcı adınız yanlış.");
        }
    }
}
