public class Person {
    String name;
    int age;
    String work;
    int salary;
    String phone;
    int phonePrice;

    public Person(String name, int age, String work, int salary, String phone, int phonePrice) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
        this.phonePrice = phonePrice;
    }

    public void getInfo() {
        System.out.println(
                "\n name : " + name +
                        "\n age : " + age +
                        "\n work : " + work +
                        "\n salary : " + salary +
                        "\n phone : " + phone +
                        "\n phonePrice : " + phonePrice );

    }




}
