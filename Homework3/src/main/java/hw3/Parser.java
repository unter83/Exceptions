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
                if (isNum(day) && isNum(month) && isNum(year)) {
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
            if (array[i].length() == 0 && (array[i].toLowerCase() == "m" ||
                    array[i].toLowerCase() == "f" ||
                    array[i].toLowerCase() == "м" ||
                    array[i].toLowerCase() == "ж"))
//            if (array[i].length() == 0 && (Character.toLowerCase(array[i].charAt(0)) == 'm' ||
//                    Character.toLowerCase(array[i].charAt(0)) == 'f' ||
//                    Character.toLowerCase(array[i].charAt(0)) == 'м' ||
//                    Character.toLowerCase(array[i].charAt(0)) == 'ж'))
                return i;
        }
        throw new WrongEntireException("Неправильный ввод. " +
                "Проверьте пол");
    }

    public void setData(String data) {
        this.data = data;
    }
}

