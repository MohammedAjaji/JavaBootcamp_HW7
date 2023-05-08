public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        if(amount > balance){
            System.out.println("Sorry your balance is low you cannot take this amount");
        }else {
            System.out.println("Withdrawing " + amount + " from " + name + " id: " + id);
            System.out.println(name + " balance was " + balance);
             balance = balance - amount;
            System.out.println(name + " balance now " + balance);
        }
        return balance;
    }

    public int debit(int amount){
        System.out.println("Depositing " + amount + " to " + name + " id: " + id);
        System.out.println(name + " balance was " + balance);
        balance = balance + amount;
        System.out.println(name + " balance now " + balance);
        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount > balance){
            System.out.println("Sorry your balance is low you cannot transfer this amount");
        }else {
            System.out.println("Transferring " + amount + " from " + name + " to " + another.name);
            another.balance = another.balance + amount;
            balance = balance - amount;
            System.out.println(name + " balance now " + balance);
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
