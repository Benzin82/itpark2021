package Lession2;

public class Arith {

    public static void main(String[] args) {

        long sum = summa(5, 3);
        System.out.println("Сумма равна = " + sum);

        long dif = difference(5, 5);
        System.out.println("Разность равна = " + dif);

        long mul = multiply(5, 5);
        System.out.println("Множество равно = " + mul);

        long div = divide(5, 5);
        System.out.println("Результат деления равен = " + div);
}
    private static int summa (int arg1, int arg2) {
        return arg1 + arg2;
    }
       public static int difference(int arg1, int arg2) {
                        return arg1 - arg2;

        }
            public static int multiply (int arg1, int arg2) {
                                return arg1 * arg2;
            }

                public static int divide (int arg1, int arg2) {
                                        return arg1 / arg2;
                }


    }


