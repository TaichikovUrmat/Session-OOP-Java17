import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Student student1 = new Student("Amir", LocalDate.of(2006, 11, 6), "+996800900400", "KGZ");
//        Student student2 = new Student("Junusbek", LocalDate.of(2004, 1, 5), "+996800900900", "KGZ");
//        Student student3 = new Student("Aibike", LocalDate.of(2006, 2, 9), "+996800900600", "KGZ");
//        Student student4 = new Student("Sanjar", LocalDate.of(2004, 3, 30), "+996800900800", "KGZ");
//        Student student5 = new Student("Artur", LocalDate.of(2003, 9, 25), "+996800900900", "KGZ");
//
//        Student[] students = {student1, student2, student3, student4, student5};
//
//        for (Student student : students) {
//            student.getInfo();
//        }

        Person person1 = new Person("Amir",18,"java developer",1000,"14pro",4500);
        Person person2 = new Person("Junusbek",18,"java developer",100,"13pro",4900);
        Person person3 = new Person("Aibike",18,"java developer",10001,"11pro",5000);
        Person person4 = new Person("Sanjar",18,"java developer",1600,"17pro",7700);
        Person person5 = new Person("Artur",18,"java developer",90000,"15pro",6600);
        Person person6 = new Person("Nurtilek",18,"java developer",101,"12pro",4000);

        Person[] personArray = {person1,person2,person3,person4,person5,person6};

//     // todo Эн коп айлык алган адамды чыгардык

        Person maxSalary =  personArray[0];
        for (Person person : personArray) {
            if (person.salary  > maxSalary.salary){
                maxSalary = person;
            }
        }
        System.out.println("maxSalary = " + maxSalary.salary);




        // todo Эн аз айлык алган адамды чыгардык
        Person minSalary =  personArray[0];
        for (Person person : personArray) {
            if (person.salary  < minSalary.salary){
                minSalary = person;
            }
        }
        System.out.println("minSalary = " + minSalary.salary);


        System.out.println("Amir");
        System.out.println("Amir");
        System.out.println("Amir");
        System.out.println("Amir");
        System.out.println("Amir");
        System.out.println("Amir");
        System.out.println("Amir");
        System.out.println("Amir");
        System.out.println("Amir");
        System.out.println("Amir");
        System.out.println("Amir");

    }
}