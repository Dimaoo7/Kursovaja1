import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов", "Александр", "Александрович", 1, 91_000);
        employees[1] = new Employee("Крюкова", "Ольга", "Петровна", 2, 42_000);
        employees[2] = new Employee("Дудник", "Андрей", "Романович", 3, 61_000);
        employees[3] = new Employee("Медведев", "Дмитрий", "Анатольевич", 4, 34_000);
        employees[4] = new Employee("Тринкер", "Борис", "Давидович", 5, 42_000);
        employees[5] = new Employee("Багдасарян", "Рафаэль", "Мкртычевич", 4, 76_000);
        employees[6] = new Employee("Бобров", "Рома", "Иванович", 2, 46_000);
        employees[7] = new Employee("Иванов", "Рафаэль", "Абрамович", 3, 24_000);
        employees[8] = new Employee("Раманов", "Глеб", "Петрович", 1, 54_000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цыфру вашего вопроса: \n 1.Получить список всех сотрудников со всеми имеющимися по ним данными. \n " +
                "2.Посчитать сумму затрат на зарплаты в месяц. \n 3.Найти сотрудника с минимальной зарплатой. \n " +
                "4.Найти сотрудника с максимальной зарплатой. \n 5.Подсчитать среднее значение зарплат \n " +
                "6.Получить Ф. И. О. всех сотрудников");
        int a = sc.nextInt();
        if (a == 1) {
            Employee.printAllInfo(employees);
        }
        if (a == 2) {
            Employee.printAllPaymentPerMonth(employees);
        }
        if (a == 3) {
            Employee.printEmployeeMinSalary(employees);
        }
        if (a == 4) {
            Employee.printEmployeeMaxSalary(employees);
        }
        if (a == 5) {
            Employee.printAverageSalary(employees);
        }
        if (a == 6) {
            Employee.printEmployeeInfo(employees);
        } else if (a < 1 || a > 6) {
            System.out.println("Введено некорректное значение"); //АААААААА КАК ЖЕ ЧИСТО НЕ ОДНОГО ВАРНИНГА КАЙФФФ
        }
        {

        }
    }
}