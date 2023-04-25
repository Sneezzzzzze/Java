public class Owner {
    private String name;
    private Animal animal;
    public Owner(){
        this("", null);
    }
    public Owner(String name) {
        this(name, null);
    }
    public Owner(Animal animal) {
        this("", animal);
    }
    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void feedFood(Food f) {
        getAnimal().eat(f);
    }
    @Override
    public String toString() {
        return "Owner : name = " + this.name + ", Animal : name = " + animal.getName() + ", power = " + animal.getPower() + ", age = " + animal.getAge();
    }
    public void protectOwnerFrom(Animal a) {
        if(this.getAnimal() instanceof Dog d) {
            //d.kick(a);
            ((Dog)animal).kick(a);
        }
        else {
            ((Pigeous)animal).wingAttack(a);
        }
    }
}
