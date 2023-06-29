package Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws nullStringException {
        String str;
        try (Scanner sc = new Scanner(System.in);) {
            boolean ok = false;
            while (!ok) {
                System.out.print("Введите строку: ");
                str = sc.nextLine();
                if (str.isBlank()) {
                    throw new nullStringException("Вы ввели пустую строку");
                } else
                    ok = true;
            }
        }
    }

    private static class nullStringException extends Throwable {
        public nullStringException(String msg) {
            super(msg);
        }
    }
}
