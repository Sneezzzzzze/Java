public abstract class Food {
    private String name;
    public Food(){};
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract int getPower();
}
