class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return 50000.0;
    }
}