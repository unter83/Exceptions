package hw3;

import hw3.Controller.Controller;

import java.util.Scanner;

public class UI {

    public void showGreetings() {
        System.out.println("Приложение запрашивает данные пользователя, проверяет их на корректность и добавляет их в \n");

    }
    public void askData() {
        Scanner sc = new Scanner(System.in,"Cp1251");
        System.out.println("Введите данные человека(Фамилия имя отчество, дата рождения, номер телефона, пол:");
        String data = sc.nextLine();
        Controller controller = new Controller(data);
        controller.showUser();

    }
}
