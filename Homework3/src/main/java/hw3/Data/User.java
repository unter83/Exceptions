package hw3.Data;

public class User {
    private String name;
    private String secondName;
    private String fatherName;
    private String phone;
    private String birthDate;
    private String sex;

    public User() {
        this("Name unknown", "Second name unknown", "Fathers name unknown", "Phone Unknown",
                "Birth date unknown", "Sex unknown");
    }

    public User(String name, String secondName, String fatherName, String phone, String birthDate, String sex) {
        this.name = name;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.phone = phone;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
