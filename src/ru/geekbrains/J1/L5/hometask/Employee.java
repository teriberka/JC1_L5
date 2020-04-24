package ru.geekbrains.J1.L5.hometask;
import java.util.Random;

public class Employee {
    // 1. Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
    String name;
    String lastName;
    String middleName;
    int salary;
    String position;
    int birthDate;
    int id;

    private static final Random RANDOM = new Random();
    static final int CURRENT_YEAR = 2020;

    public Employee(){

    }

    // 2. Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee(String name, String lastName, String middleName, int salary, String position, int birthDate, int id) {
        this.name = name;
        this.lastName = lastName;
        this.middleName =  middleName;
        this.salary = salary;
        this.position = position;
        this.birthDate = birthDate;
        this.id = id;
    }

    // 4. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
    public Employee(String name, String lastName, String middleName, int salary, String position, int birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.middleName =  middleName;
        this.salary = salary;
        this.position = position;
        this.birthDate = birthDate;
        this.id = RANDOM.nextInt(999999);
    }

    // 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getPosition() {
        return this.position;
    }

    public int getBirthDate() {
        return this.birthDate;
    }

    public int getId() {
        return this.id;
    }


    // 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.

    public void setSalary(int money) {
        this.salary += money;
    }
}

