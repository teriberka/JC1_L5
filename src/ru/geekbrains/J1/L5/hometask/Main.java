package ru.geekbrains.J1.L5.hometask;

public class Main {

    public static void main(String[] args) {
        Employee worker1 = new Employee();
        worker1.name = "Иван";
        worker1.lastName = "Иванов";
        worker1.middleName = "Иванович";
        worker1.salary = 50000;
        worker1.position = "Junior developer";
        worker1.birthDate = 1987;
        worker1.id = 1;


        // 2.Конструктор класса должен заполнять эти поля при создании объекта;
        Employee worker2 = new Employee("Петр","Петров","Петрович",100000,"Middle developer", 1984, 2);


        // 4. Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println("ФИО: " + worker1.getLastName() + " "+ worker1.getName() + " " + worker1.getMiddleName());
        System.out.println("должность: " + worker1.getPosition());

        // 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        Employee worker3 = new Employee("Имя3","Фамилия3","Отчество3",55000,"Огтшщк developer",1985, 3);
        Employee worker4 = new Employee("Имя4","Фамилия4","Отчество4",150000,"Senior developer",1979, 4);
        Employee worker5 = new Employee("Имя5","Фамилия5","Отчество5",10000,"Labourer",1961);


        Employee[] arrEmployee = new Employee[5];
        arrEmployee[0] = worker1;
        arrEmployee[1] = worker2;
        arrEmployee[2] = worker3;
        arrEmployee[3] = worker4;
        arrEmployee[4] = worker5;

        for (int i = 0; i<5; i++){
            if (Employee.CURRENT_YEAR - arrEmployee[i].birthDate > 40) {
                System.out.println("ФИО: " + arrEmployee[i].getLastName() + " " + arrEmployee[i].getName() + " " + arrEmployee[i].getMiddleName());
            }
        }

        // 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        for (int i = 0; i<5; i++){
            if (Employee.CURRENT_YEAR - arrEmployee[i].birthDate > 40) {
                System.out.println("ФИО: " + arrEmployee[i].getLastName() + " " + arrEmployee[i].getName() + " " + arrEmployee[i].getMiddleName());
                System.out.println("Задолгую работу в компании мы повышаем вам зарплата");
                System.out.println("выша зарплата была: " + arrEmployee[i].getSalary());
                arrEmployee[i].setSalary(5000);
                System.out.println("выша зарплата стала: " + arrEmployee[i].getSalary());
            }
        }

        // 7. *Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5

        int sumSalary = 0, sumAge = 0, arrLength = 5;

        for (int i = 0; i < arrLength; i++){
            sumAge += Employee.CURRENT_YEAR - arrEmployee[i].getBirthDate();
            sumSalary += arrEmployee[i].getSalary();
        }

        System.out.println("среднее арифметическое возраста сотрудников: " + sumAge / arrLength);
        System.out.println("среднее арифметическое зарплаты сотрудников: " + sumSalary / arrLength);

        // 8. ***Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
        System.out.println("id: " + arrEmployee[4].getId());
    }
}

