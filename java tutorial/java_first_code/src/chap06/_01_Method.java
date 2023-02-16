package chap06;

public class _01_Method {
    public static void sayHello() {
        System.out.println("hello I'm method");
    }


    public static void main(String[] args) {
        // Call Method
        System.out.println("before Call Method");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("after Call Method");
    }
}
