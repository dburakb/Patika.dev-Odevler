import java.util.Scanner;

public class Palindrom {

    static boolean p(int b) {
        int tenp = b, reverseNumber = 0, lastNumber;

        if (tenp == 0)
            return true;
        else {
            while (tenp != 0) {
                lastNumber = tenp % 10;
                reverseNumber = (reverseNumber * 10) + lastNumber;
                tenp /= 10;
            }

            if (reverseNumber == b) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        System.out.println(p(a));
    }
}
