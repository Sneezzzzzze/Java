package Lab07_03;
public class Mage extends Player {
    public void addEquipment(Item i) {
        i.use(this);
    }
    public void attack(Player p) {
        p.attacked(this.getATK()*2.5);
        this.setMP(this.getMP() - 5);
    }
    public void attacked(double n) {
        this.setHP(n - this.getHP());
    }
    public Mage() {
        this.setHP(this.getHP() + 10);
        this.setMP(this.getMP() + 20);
        this.setATK(this.getATK() + 5);
    }
}
