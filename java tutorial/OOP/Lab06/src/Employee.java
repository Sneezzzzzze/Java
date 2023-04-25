public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public void eat(Food f){
        energy += f.getEnergy();
    }
    public boolean buyFood(Seller s){
        Food f = s.sell(this);
        if (f == null) {
            return false;
        } else {
            this.eat(f);
            return true;
        }
    }
    public boolean equals(Employee e){
        if (e.equals(name)) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString(){ 
        return "My name is " + name +".\n" + "I have " + energy + " energy left.\n" + "I have a balance of " + wallet.getBalance() + " baht.";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        return nationality;
    }
    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }
}
