import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        double kenar1, kenar2, hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik üçgende hipotenüs bulma programına hoş geldiniz!");
        System.out.println("Öncelikle formülümüz: a.a + b.b = c.c\n");

        System.out.print("1. kenarın uzunluğunu giriniz: ");
        kenar1 = input.nextDouble();
        System.out.print("2. kenarın uzunluğunu giriniz: ");
        kenar2 = input.nextDouble();

        hipotenus = Math.sqrt(kenar1 * kenar1 + kenar2 * kenar2);

        System.out.println("\n\nÜçgenin hipotenüsü: " + hipotenus);
    }
}
