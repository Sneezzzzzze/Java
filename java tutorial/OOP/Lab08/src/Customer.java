import java.util.ArrayList;
public class Customer {
    private String firstName;
    private String lastName;
//    private Account acct[];
    private int numOfAccount;
    ArrayList<Account> acct;
    public Customer(){
        this.firstName = "";
        this.lastName = "";
//        acct = new Account[5];
        acct = new ArrayList();
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        acct = new Account[5];
        acct = new ArrayList();
    }
    public void addAccount(Account acct) {
//        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
        this.acct.add(acct);
    }
    
    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " has "+ numOfAccount +" accounts."; 
    }
    public Account getAccount(int index) {
//        return acct[index];
        return acct.get(index);
    }
    public int getNumOfAccount() {
//        return numOfAccount;
        return acct.size();
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
