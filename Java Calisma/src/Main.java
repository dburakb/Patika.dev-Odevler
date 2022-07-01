import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        double ortalama;
        String sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat=inp.nextInt();
        System.out.print("\n");

        System.out.print("Fizik notunuz: ");
        fizik=inp.nextInt();
        System.out.print("\n");

        System.out.print("Kimya notunuz: ");
        kimya=inp.nextInt();
        System.out.print("\n");

        System.out.print("Türkçe notunuz: ");
        turkce=inp.nextInt();
        System.out.print("\n");

        System.out.print("Müzik notunuz: ");
        muzik=inp.nextInt();
        System.out.print("\n");

        ortalama=(mat+fizik+kimya+turkce+muzik)/5.0;
        System.out.println("Ortalamanız: " + ortalama);

        sonuc = (ortalama > 60) ? "Geçtin" : "Kaldın";
        System.out.println(sonuc);
    }
}