//Задание 1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Person {

    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salary;
    public int age;

    //Задание 2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Person(String fullName, String post, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Person() {
    }
    //Задание 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void printInfo() {
        System.out.printf("Имя: %s , должность: %s , email: %s , телефон: %s , зарплата: %d , возраст: %d \n", fullName, post, email, phone, salary, age);

    }


}
