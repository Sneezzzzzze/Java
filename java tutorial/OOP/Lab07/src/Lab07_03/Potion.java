package Lab07_03;
public class Potion extends Item{
    public void use(Player P) {
        P.setHP(P.getHP() + 10);
    }
}
