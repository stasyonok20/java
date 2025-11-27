public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("Ivan Petrov");
        employees[1] = new Developer("Anna Sidorova");
        employees[2] = new Designer("Petr Ivanov");

        for (Employee employee : employees) {
            System.out.println("Sotrudnik: " + employee.getName() + ", ZP: " + employee.getSalary());
        }
    }
}