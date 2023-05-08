public class Employee {

    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary() {
        System.out.println(name + " Annual Salary is");
        return salary*12;
    }

    public double raisedSalary(double percent){
        percent = percent/100;
        System.out.println("Salary was " + salary);
        salary = salary + (salary*percent);
        System.out.println("Salary after a raise of " + (percent*100) + "% is " + salary);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
