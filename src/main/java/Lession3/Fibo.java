package Lession3;

import java.util.Scanner;

public class Fibo {


    public static void main(String[] args) {

        System.out.print("Введите n: ");

        Scanner scan = new Scanner(System.in); {
            int n = scan.nextInt();

            int a = 0;
            int b = 1;

            for (int i = 2; i <= n; ++i) {
                int next = a + b;
                a = b;
                b = next;
                System.out.println(b);
            }
        }

    }
}
