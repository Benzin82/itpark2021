package HW5;

import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {

        System.out.print("Введите n: ");

        Scanner scan = new Scanner(System.in); {
            int n = scan.nextInt();

            int a = 0;
            int b = 1;

            for (int i = 0; n >= i; ++i) {
                int c = a + b;
                a = b;
                b = c;
                System.out.println(b);
            }
        }

    }
}
