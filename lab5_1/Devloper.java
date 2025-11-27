class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return 60000.0;
    }
}