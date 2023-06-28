package Homework1;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Программа показывает выполнение трех разных исключений\n");
        int num1 = 0, num2 = 0;
        double num3 = 0;
        try {
            num1 = ioeMethod();
            try {
                num2 = npeMethod(num1);
                System.out.println(num2);
                try {
                    num3 = ameMethod(num2);
                    System.out.println("Результат деления числа 10 на " + num2 + " = " + num3);
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка деления на ноль");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Нет такого числа в массиве");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        } catch (Exception e) {
            System.out.println("Вы ввели не число");
        }
    }

    public static int ioeMethod() throws IOException, Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 9 для поиска числа в массиве (0,.., 9): ");
        int a = sc.nextInt();
        return a;
    }

    public static int npeMethod(int index) throws ArrayIndexOutOfBoundsException {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        return array[index];
    }

    public static double ameMethod(double number) throws ArithmeticException {
        return 10 / number;
    }

}