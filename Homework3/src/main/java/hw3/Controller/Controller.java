package hw3.Controller;

import hw3.Data.User;
import hw3.Parser;

public class Controller {
    private String data;
    public String[] array;
    private Parser parser = new Parser();
    private User user = new User();
//    private int nameIndex;
//    private int snameIndex;
//    private int fnameIndex;
      private int phoneIndex;
      private int bitrhDateIndex;
      private int sexIndex;

    public Controller(String data) {
        this.data = data;
        parser.setData(data);

        array = parser.parseToArray();
        phoneIndex = parser.findPhone(array);
        user.setPhone(array[phoneIndex]);
        bitrhDateIndex = parser.findBirthDate(array);
        user.setBirthDate(array[bitrhDateIndex]);
        sexIndex = parser.findSex(array);
        user.setSex(array[sexIndex]);

    }

    public void showUser() {
        System.out.println(user.toString());
    }

}
