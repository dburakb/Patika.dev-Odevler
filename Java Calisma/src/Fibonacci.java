public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;

        c = a + b;
        System.out.println("\n" + a + "+" + b + "=" + c);

        for (c = 0; c < 34;) {
            c = a + b;
            System.out.println("\n" + a + "+" + b + "=" + c);
            a = b;
            b = c;
        }
    }
}
