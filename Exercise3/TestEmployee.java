class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }

    public String toString() {
        return super.toString() +
               ", Bonus: " + bonus +
               ", Total: " + getTotalSalary();
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Manager m = new Manager("Karim", 3000, 1000);
        System.out.println(m);
    }
}
