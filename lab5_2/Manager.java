public class Manager extends Employee implements ProjectManager {
    public Manager(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return 75000.0;
    }

    @Override
    public void assignTask(String task, Employee employee) {
        System.out.println("Meneger " + this.getName() + " assign task '" + task + "' to an employee " + employee.getName() + ".");
    }
}