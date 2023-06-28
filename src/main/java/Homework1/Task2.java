package Homework1;

import java.io.Serializable;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{8, 6, 0, 5, 9, 4};
        int[] array2 = new int[]{4, 3, 3, 0, 1, 8};
        double[] array3 = arrayDivider(array1, array2);
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }

    static double[] arrayDivider(int[] array1, int[] array2){
        if (array1.length != array2.length) {
            throw new arraydividerEcxeption("Длины массивов не равны");
        }
        else {
            int length = array1.length;
            double[] resultArray = new double[length];

            for (int i = 0; i < length; i++) {
                resultArray[i] =  (double) array1[i] / array2[i];
                if (!Double.isFinite(resultArray[i]))
                    throw new arraydividerEcxeption("При выполнении деления в индексе " + i + " случилось деление на 0");
            }
            return resultArray;
        }
    }

    private static class arraydividerEcxeption extends RuntimeException {
        public arraydividerEcxeption(String msg) {
            super(msg);
        }
    }
}
