
public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    public Customer(){
        this.firstName = "";
        this.lastName = "";
        this.acct = null;
    }
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }
    public CheckingAccount getAcct() {
        return acct;
    }
    public CheckingAccount getCheckingAccount() {
        return acct;
    }
    @Override
    public String toString() {
        if (acct == null) {
            return firstName + " " + lastName + " doesn’t have account.";
        } else{
            return "The " + firstName + " account has " + acct.getBalance() + " baht and " + acct.getCredit() + " credits.";
        }
    }
    public boolean equals(Customer c) {
        if ((c.firstName.equals(firstName)) && (c.lastName.equals(lastName))) {
            return true;
        } else{
            return false;
        }
    }
}