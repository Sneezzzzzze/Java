package Lab04_03;
public class Cat {
    private String name;
    private String color;
    public double height;
    public double weight;
    private void setWeight(double w) {
        if (w < 0) {
            System.out.println("Error");
        } else{
            weight = w;
        }
    }
    private void setHeight(double h){
        if (h < 0) {
            System.out.println("Error");
        } else{
            height = h;
        }
    }
    private void setName(String n) {
        name = n;
    }
    private void setColor(String c) {
        color = c;
    }
    public void upWeight(double w){
        if (w < 0) {
            System.out.println("Error");
        } else{
            setWeight(w);
        }
    }
    public void upHeight(double h){
        if (h < 0 ) {
            System.out.println("Error");
        } else{
            setHeight(h);
        }
    }
    public void downWeight(double w) {
        weight -= w;
    }
    public void defineCat(String n, String c) {
        setName(n);
        setColor(c);
    }
    public void speak() {
        System.out.println("Name : " + name+"\nColor : " + color + "\nHeight : " + height + "\nWeight : " + weight);
    }
}
