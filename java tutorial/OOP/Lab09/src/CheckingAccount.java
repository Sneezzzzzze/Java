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
    public void withdraw(double amount) throws WithdrawException {
        if (amount > 0) {
            if ((super.getBalance() - amount) > 0) {
                setBalance(getBalance() - amount);
                System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else if (((super.getBalance() - amount) < 0) && (((super.getBalance() - amount) + credit) > 0)){
                credit = credit + getBalance() - amount;
                super.balance = 0;
                System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else {
                throw new WithdrawException("Account " + getName() + " has not enough money!");
        }
    }
}
    public void withdraw(String a) throws WithdrawException {
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
                throw new WithdrawException("Account " + getName() + " has not enough money!");
            }
        }
    }

    @Override
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
