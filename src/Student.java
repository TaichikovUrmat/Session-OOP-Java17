import java.time.LocalDate;

public class Student {
    String name;
    LocalDate dateOfBirth;
    String phoneNumber;
    String nationality;

//    public Student() {
//    }

    public Student(String name, LocalDate dateOfBirth, String phoneNumber, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public void getInfo() {
        System.out.println(
                "\n name : " + name +
                        "\n dateOfBirth : " + dateOfBirth +
                        "\n phoneNumber : " + phoneNumber +
                        "\n nationality : " + nationality);
        System.out.println("getAge() = " + getAge());

    }

    public  int getAge(){
        return 2025 - dateOfBirth.getYear();
    }



}
