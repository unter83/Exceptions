package Homework2;

public class Task3 {
    public static void main(String[] args){
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        try {
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }

    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
