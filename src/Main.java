import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов", "Александр", "Александрович", 1, 55_000);
        Employee employee2 = new Employee("Крюкова", "Ольга", "Петровна", 2, 64_000);
        Employee employee3 = new Employee("Дудник", "Андрей", "Романович", 3, 42_000);
        Employee employee4 = new Employee("Медведев", "Дмитрий", "Анатольевич", 4, 75_000);
        Employee employee5 = new Employee("Тринкер", "Борис", "Давидович", 5, 81_000);
        Employee employee6 = new Employee("Багдасарян", "Рафаэль", "Мкртычевич", 2, 97_000);


        int[] j = {employee1.getSalary(), employee2.getSalary(), employee3.getSalary(), employee4.getSalary(),
                employee5.getSalary(), employee6.getSalary()};
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цыфру вашего вопроса: \n 1.Получить список всех сотрудников со всеми имеющимися по ним данными. \n " +
                "2.Посчитать сумму затрат на зарплаты в месяц. \n 3.Найти сотрудника с минимальной зарплатой. \n " +
                "4.Найти сотрудника с максимальной зарплатой. \n 5.Подсчитать среднее значение зарплат \n " +
                "6.Получить Ф. И. О. всех сотрудников");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println(employee1 + "\n" + employee2 + "\n"
                    + employee3 + "\n" + employee4 + "\n" + employee5 + "\n" +
                    employee6);
        }
        if (a == 2) {
            for (int i : j) {
                sum = sum + i;
            }
            System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        }
        int b = 100_000;
        if (a == 3) {
            for (int i : j) {
                if (i < b) {
                    b = i;
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + b);
        }
        b = 0;
        if (a == 4) {
            for (int i : j) {
                if (i > b) {
                    b = i;
                }
            }
            System.out.println("Сотрудник с максимальной зарплатой" + b);
        }
        //Для массива длина которого меньше чем число то выводить последний элемент массива пока не дойдет до конца

        Employee[] Employee = new Employee[11];
        Employee[10] = new Employee("Тринкер", "Борис", "Давидович", 5, 81_000);
    }
}