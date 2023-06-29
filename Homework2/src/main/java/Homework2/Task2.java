package Homework2;

public class Task2 {
    public static void main(String[] args) {
        int d = 0;
        double[] intArray = new double[9];
        //double[] intArray  = {1, 3, 5, 2, 6, 7, 6, 9, 5, 0};
        double catchedRes1 = intArray[8] / d;
        if (Double.isInfinite(catchedRes1) || Double.isNaN(catchedRes1)) {
            ArithmeticException e = new ArithmeticException();
            System.out.println("Catching exception: " + e);
        }
        else
            System.out.println("catchedRes1 = " + catchedRes1);
    }
}
