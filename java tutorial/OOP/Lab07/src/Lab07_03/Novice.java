package Lab07_03;
public class Novice extends Player{
    public void addEquipment(Item i) {
        i.use(this);
    }
    public void attack(Player p) {
        p.attacked(this.getATK());
    }
    public void attacked(double n) {
        this.setHP(this.getHP() - n);
    }
    public Novice() {
        this.setHP(this.getHP() + 10);
        this.setMP(this.getMP() + 10);
        this.setATK(this.getATK() + 5);
    }
}
