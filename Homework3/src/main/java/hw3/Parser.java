package hw3;

import hw3.Exceptions.WrongEntireException;

public class Parser {
    private String data;

    public Parser() {
    }

    public Parser(String data) {
        this.data = data;
    }

    public String[] parseToArray() throws WrongEntireException {
        String [] array = data.split(" ");
        if(array.length != 6) throw new WrongEntireException("Неправильный ввод. " +
                "Проверьте количество введенных данных");
        else return array;
    }

    public int findPhone(String[] array) throws WrongEntireException {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 12 && array[i].charAt(0) == '+' && array[i].charAt(1) == '7') {
                String phone = array[i].substring(2);
                if (isNum(phone)) {
                    return i;
                }
            }
            if (array[i].length() == 11 && array[i].charAt(0) == '8') {
                String phone = array[i].substring(1);
                if (isNum(phone)) {
                    return i;
                }
            }
        }
        throw new WrongEntireException("Неправильный ввод. " +
                "Проверьте номер телефона");
    }

    private boolean isNum(String str) {
        try {
            double i = Double.parseDouble(str);
        }
        catch (NumberFormatException e) {
            return false;
        }
       return true;
    }

    public int findBirthDate(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i].length() == 10 && array[i].charAt(2) == '.' && array[i].charAt(5) == '.')) {
                String day = array[i].substring(0, 2);
                String month = array[i].substring(3, 5);
                String year = array[i].substring(6);
                if ((isNum(day) && isNum(month) && isNum(year) &&
                        (Integer.parseInt(month) > 0 && Integer.parseInt(month) < 13) &&
                        (Integer.parseInt(day) > 0 && Integer.parseInt(day) < 32) &&
                        (Integer.parseInt(year) > 1900 && Integer.parseInt(year) < 2024))) {
                        return i;
                }
            }
        }
        throw new WrongEntireException("Неправильный ввод. " +
                    "Проверьте дату рождения");
    }

    public int findSex(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            str.toLowerCase();
            if (array[i].length() == 1)
                if (array[i].toLowerCase().equals("m")  ||
                    array[i].toLowerCase().equals("f"))
                    return i;
        }
        throw new WrongEntireException("Неправильный ввод. " +
                "Проверьте пол");
    }

    public void setData(String data) {
        this.data = data;
    }
}

