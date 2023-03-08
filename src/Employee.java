public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;
    private  int department;
    private  int salary;
    private static int id = 1;
    private static int idCount = 0;
    private static int sum = 0;
    private static String c = null;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        idCount = idCount;
        idCount++;
    }

    public String getSurname() {
        return this.surname;
    }
    public String getName() {
        return this.name;
    }
    public String getPatronymic() {
        return this.patronymic;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Сотрудник: \n" +
                "ID: " + (id++) + "\n" +
                "Фамилия: " + surname + "\n" +
                "Имя: " + name + "\n" +
                "Отчество: " + patronymic + "\n" +
                "Департамент: " + department + "\n" +
                "Зарплата: " + salary + "\n";
    }

    public static Employee[] allInfo(Employee[] a) {
        for (Employee employee : a) {
            System.out.println(employee);
        }
        return a;
    }

    public static void allPaymentPerMonth(Employee[] a) {
        for (Employee employee : a) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);

    }

    public static void employeeWithSmall(Employee[] a) {
        int b = 100_000;
        for (Employee employee : a) {
            if (employee.getSalary() < b) {
                b = employee.getSalary();
                c = employee.getName() + " " + employee.getSurname() + " " + employee.getPatronymic();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + b + " " + c);

    }

    public static void employeeWithBig(Employee[] a) {
        int b = 0;
        for (Employee employee : a) {
            if (employee.getSalary() > b) {
                b = employee.getSalary();
                c = employee.getName() + " " + employee.getSurname() + " " + employee.getPatronymic();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + b + " " + c);
    }

    public static void averageSalary(Employee[] a) {
        for (Employee employee : a) {
            sum += employee.getSalary();
        }
        System.out.println("Средняя зарплата: " + (sum / a.length));

    }

    public static void employeeInfo(Employee[] a) {
        for (Employee employee : a) {
            System.out.println("Имя сотрудника: " + employee.getName() +
                    "\n" + "Фамилия сотрудника: " + employee.getSurname() +
                    "\n" + "Отчество сотрудника: " + employee.getPatronymic() + "\n");
        }

    }

    }

