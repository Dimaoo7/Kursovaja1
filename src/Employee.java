public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;
    private final int department;
    private final int salary;
    private static int id = 1;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
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

/*
        String[] names = {"Иванов, Александр Александрович ", "Крюкова, Ольга Петровна", "Дудник, Андрей Романович",
                "Медведев, Дмитрий Анатольевич", "Тринкер, Борис Давидович" , "Багдасарян, Рафаэль Мкртычевич"};
*/

}
