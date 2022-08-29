import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int hak = 3,bakiye = 1500, secim, tutar;
        String username = "dburakb", password = "burak123", a, b;

        Scanner input = new Scanner(System.in);

        while (hak > 0) {
            System.out.println("\nDBB Bankasına Hoş Geldiniz!");
            System.out.print("Kullanıcı adınız: ");
            a = input.nextLine();
            System.out.print("Şifreniz: ");
            b = input.nextLine();

            if (username.equals(a) && password.equals(b)){
                System.out.println("\nGiriş başarılı");
                do{
                    System.out.println("\n1-Para Çekme \n2-Para Yatırma \n3-Bakiye Öğren \n4-Çıkış");
                    System.out.print("Yukarıdaki işlemlerden birini seçiniz: ");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1 -> {
                            System.out.print("\nÇekmek istediğiniz tutarı giriniz: ");
                            tutar = input.nextInt();
                            if (tutar <= bakiye) {
                                bakiye -= tutar;
                                System.out.println("\nİşlem başarılı!\nBakiyeniz: " + bakiye);
                            } else {
                                System.out.println("\nTutar hatası!");
                            }
                        }
                        case 2 -> {
                            System.out.print("\nYatırmak istediğiniz tutarı giriniz: ");
                            tutar = input.nextInt();
                            if (tutar >= 0) {
                                bakiye += tutar;
                                System.out.println("\nİşlem başarılı!\nBakiyeniz: " + bakiye);
                            } else {
                                System.out.println("\nTutar hatası!");
                            }
                        }
                        case 3 -> System.out.println("\nBakiyeniz: " + bakiye);
                    }
                }
                while (secim != 4);
                System.out.println("\nÇıkış başarılı!");
                hak=3;

            }
            else {
                if (hak == 1) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    break;
                }
                else {
                    hak--;
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }
    }
}