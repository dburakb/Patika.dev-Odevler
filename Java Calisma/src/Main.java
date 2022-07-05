import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat=0,fizik=0,kimya=0,turkce=0,muzik=0,a,b,c,d,e;
        double ortalama, dersSayisi = 0.0;
        String sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        a=inp.nextInt();
        if (a<=100&&a>=0){
            mat=a;
            dersSayisi++;
        }
        System.out.print("\n");

        System.out.print("Fizik notunuz: ");
        b=inp.nextInt();
        if (b<=100&&b>=0){
            fizik=b;
            dersSayisi++;
        }
        System.out.print("\n");

        System.out.print("Kimya notunuz: ");
        c=inp.nextInt();
        if (c<=100&&c>=0){
            kimya=c;
            dersSayisi++;
        }
        System.out.print("\n");

        System.out.print("Türkçe notunuz: ");
        d=inp.nextInt();
        if (d<=100&&d>=0){
            turkce=d;
            dersSayisi++;
        }
        System.out.print("\n");

        System.out.print("Müzik notunuz: ");
        e=inp.nextInt();
        if (e<=100&&e>=0){
            muzik=e;
            dersSayisi++;
        }
        System.out.print("\n");

        ortalama=(mat+fizik+kimya+turkce+muzik)/dersSayisi;
        System.out.println("Ortalamanız: " + ortalama);

        if (ortalama>=55){
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        }
        else {
            System.out.println("Maalesef sınıfı geçemediniz. Seneye tekrar görüşmek üzere!");
        }
    }
}
