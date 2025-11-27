public class Company {
    public static void main(String[] args) {
        Employee manager = new Manager("Ivan Petrov");
        Employee developer = new Developer("Anna Sidorova");
        Employee designer = new Designer("Petr Ivanov");

        Employee[] employees = {manager, developer, designer};

        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getName() + ", ZP: " + emp.getSalary());
        }

        System.out.println("\n Delegirovanie task");
        if (manager instanceof ProjectManager) {
            ProjectManager pm = (ProjectManager) manager;
            pm.assignTask("Devloper new modul", developer);
            pm.assignTask("Create desing for website", designer);
        }
    }
}