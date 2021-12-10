import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class PersonTestDrive {
    public static void main(String[] args) {

        Person person = new Person("Dmitriy Dmitrievich", "senior developer", "dimkadruz@mail.ru", "+79101053175", 999999, 25);
        person.printInfo();

        System.out.println();

        //Задание 4.Создать массив из 5 сотрудников.

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Vasiliy Vasilievich", "cooker", " vasy@mail.ru", "+79123456784", 32322, 34);
        personArray[1] = new Person("Genadiy Petrovich", "teacher", " gena@mail.ru", "+79112223344", 20000, 42);
        personArray[2] = new Person("Fedor Vasilievich", "manager", " fedy@mail.ru", "+79123321144", 50000, 45);
        personArray[3] = new Person("Nikolay Andreevich", "director", " koly@mail.ru", "+79945867532", 100000, 34);
        personArray[4] = new Person("Boris Borisovich", "water", " bory@mail.ru", "+79442112244", 30000, 52);

        //Задание 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (Person person1: personArray) {
            if ( person1.age > 40) {
                person1.printInfo();
            }

        }
    }
}
