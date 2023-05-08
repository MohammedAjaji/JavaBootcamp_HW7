public class Main {

    static Account a1 = new Account("1234", "Mohammed", 1000);
    static Account a2 = new Account("1235", "Ali", 2000);

    static Employee e1 = new Employee("9876","Omar", 20000);
    static Employee e2 = new Employee("9875","Ahmad", 10000);


    public static void main(String[] args) {

        System.out.println(a1.toString());
        System.out.println(a2.toString());

        a1.transferTo(a2,200);
        a2.credit(1000);

        System.out.println(a1.toString());
        System.out.println(a2.toString());

        System.out.println("------------------------------");

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        System.out.println(e1.getAnnualSalary());
        System.out.println(e2.getAnnualSalary());
        e1.raisedSalary(25);
        e2.raisedSalary(10);

        System.out.println(e1.toString());
        System.out.println(e2.toString());


    }
}