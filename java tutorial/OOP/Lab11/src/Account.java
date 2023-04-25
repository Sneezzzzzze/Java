public class Account {
    protected double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public void deposit(double a){
        if (a > 0) {
            balance += a;
        } else{
            setBalance(balance);
        }
    }
    public void withdraw(double a){
        if ((balance - a >= 0) && a > 0){
            balance -= a;
        }
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void showAccount() {
        System.out.println("Account has " + balance + " baht.");
    }
    public static void main(String[] args) {
        Account a = new Account(6000);
        a.withdraw(6000);
        a.withdraw(-100);
        a.showAccount();
    }
}
