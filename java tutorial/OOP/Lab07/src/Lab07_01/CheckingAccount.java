package Lab07_01;
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0, "");
        credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit() {
        return credit;
    }
    @Override
    public void withdraw(double a) {
        if (a > 0) {
            if ((super.getBalance() - a) > 0) {
                setBalance(getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else if (((super.getBalance() - a) < 0) && (((super.getBalance() - a) + credit) > 0)){
                super.balance = 0;
                credit -= a;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else {
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a) {
        double i = Double.parseDouble(a);
        if (i > 0) {
            if ((super.getBalance() - i) > 0) {
                setBalance(getBalance() - i);
                System.out.println(i + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else if (((super.getBalance() - i) < 0) && (((super.getBalance() - i) + credit) > 0)){
                super.balance = 0;
                credit -= i;
                System.out.println(i + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else {
                System.out.println("Not enough money!");
            }
        }
    }
    @Override
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
