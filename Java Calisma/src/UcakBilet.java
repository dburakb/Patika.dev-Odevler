import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        int tekCift, yas;
        double kmBasi = 0.10, km, fiyat, yasİndirimi, gdİndirimi, indirimliFiyat, normalFiyat;

        Scanner input = new Scanner(System.in);

        System.out.println("\nDBB Uçak Biletleri'ne hoş geldiniz!");
        System.out.print("\nMesafeyi(km) giriniz: ");
        km = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        tekCift = input.nextInt();

        if (tekCift != 1 && tekCift != 2 && km > 0 && yas > 0){
            System.out.println("\nHatalı Veri Girdiniz!");
        }
        else{
            if (yas < 12){
                yasİndirimi = 0.5;
            }
            else if (yas >= 12 && yas <= 24){
                yasİndirimi = 0.1;
            }
            else if (yas >= 65){
                yasİndirimi = 0.3;
            }
            else{
                yasİndirimi = 1;
            }
            if (tekCift == 2){
                gdİndirimi = 0.2;
            }
            else{
                gdİndirimi = 1;
            }
            normalFiyat = km * kmBasi;
            indirimliFiyat = normalFiyat - (normalFiyat * yasİndirimi);
            indirimliFiyat = indirimliFiyat - (indirimliFiyat * gdİndirimi);
            if (tekCift == 1){
                fiyat = indirimliFiyat;
            }
            else{
                fiyat = 2 * indirimliFiyat;
            }
            System.out.print("\nToplam Tutar: " + fiyat);
            System.out.println(" TL");
        }
    }
}
