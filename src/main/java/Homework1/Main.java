package Homework1;

import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a = 0, c;
        try {
            a = ioexceptionMethod();
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        } catch (Exception e) {
            System.out.println("Вы ввели не число");
        }

        try {
            c = npeMethod(a);
            System.out.println(c);
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет такого числа в массиве");
        }





    }

    public static int  ioexceptionMethod() throws IOException, Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ");
        int a = sc.nextInt();
        return a;
    }

    public static int npeMethod(int index) throws ArrayIndexOutOfBoundsException{
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        return array[index];
    }

}