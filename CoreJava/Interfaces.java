package CoreJava;

interface A {
    int age = 67;
    String name = "Old man";

    void show();

    void config();
}

class Interface1 implements A {
    public void show() {
        System.out.println("Inside show");
    }

    public void config() {
        System.out.println("Inside config");
    }
}

public class Interfaces {
    public static void main(String[] args) {

        A obj1 = new Interface1();
        obj1.show();
        obj1.config();

        System.out.println(A.age);
        System.out.println(A.name);
    }
}
