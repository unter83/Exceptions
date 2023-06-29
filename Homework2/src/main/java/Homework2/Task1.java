package Homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Программа реализует ввод дробного числа и обрабатывает ввод");
        float fnum = input();
        System.out.println("\nВы ввели число " + fnum);
    }
    static float input() {
        float fnum;
        try(Scanner sc = new Scanner(System.in);) {
            try {
                System.out.print("\nВведите число: ");
                fnum = sc.nextFloat();
            }
            catch (InputMismatchException e) {
                System.out.println("\n Ошибка! Введите число. ");
                fnum = input();
            }
        }
        return fnum;
    }
}