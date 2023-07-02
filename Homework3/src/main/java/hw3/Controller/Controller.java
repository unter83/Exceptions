package hw3.Controller;

import hw3.Data.User;
import hw3.Exceptions.WrongEntireException;
import hw3.Parser;
import hw3.Repositorium.Repositorium;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    private String data;
    public String[] array;
    private Parser parser = new Parser();
    private User user = new User();
    private int nameIndex;
     private int secondNameIndex;
    private int fathersNameIndex;
      private int phoneIndex;
      private int bitrhDateIndex;
      private int sexIndex;

    public Controller(String data)  {
        this.data = data;
        parser.setData(data);
        array = parser.parseToArray();

        phoneIndex = parser.findPhone(array);
        user.setPhone(array[phoneIndex]);

        bitrhDateIndex = parser.findBirthDate(array);
        user.setBirthDate(array[bitrhDateIndex]);

        sexIndex = parser.findSex(array);
        user.setSex(array[sexIndex]);

        int check = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == phoneIndex || i == bitrhDateIndex || i == sexIndex)
                continue;
            else {
                switch (check) {
                    case 0:
                        if (digitContains(array[i])) {
                            user.setSecondName(array[i]);
                            check++;
                            break;
                        }
                        throw new WrongEntireException("Ошибка в фамилии");
                    case 1:
                        if (digitContains(array[i])) {
                            user.setName(array[i]);
                            check++;
                            break;
                        }
                        throw new WrongEntireException("Ошибка в имени");
                    case 2:
                        if (digitContains(array[i])) {
                            user.setFatherName(array[i]);
                            check++;
                            break;
                        }
                        throw new WrongEntireException("Ошибка в отчестве");
                }
            }
        }
        try {
            Repositorium rep = new Repositorium(user);
        }
        catch (IOException e) {
            System.out.println("Ошибка создания файла");
            e.printStackTrace();
        }





    }

    public void showUser() {
        System.out.println(user.toString());
    }

    public boolean digitContains(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || !Character.isAlphabetic(str.charAt(i)))
                return false;
        }
        return true;
    }

}
