package hw3.Repositorium;

import hw3.Data.User;

import java.io.*;

public class Repositorium {

    private User user;

    public Repositorium(User user) throws IOException {
        this.user = user;
        openFile(user.getSecondName());
        inputDataToFile(user.getSecondName());
    }


    public void openFile(String path_file) throws IOException {
        File newfile = new File("Data\\" + path_file + ".txt");
        newfile.createNewFile();
    }


    public void inputDataToFile(String path_file) throws IOException {
        try (FileWriter writer = new FileWriter("Data\\" + path_file + ".txt", true)) {
            writer.append("<" + user.getSecondName() + ">");
            writer.append("<" + user.getName() + ">");
            writer.append("<" + user.getFatherName() + ">");
            writer.append("<" + user.getBirthDate() + ">");
            writer.append("<" + user.getPhone() + ">");
            writer.append("<" + user.getSex() + ">");
        }

    }
}
