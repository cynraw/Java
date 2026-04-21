package CoreJava;

class A {
    int age = 2;

    public void show() {

        System.out.println("Inside outer class A... " + age);
    }

    class B {
        public void showInner(int age) {
            System.out.println("Inside inner class B... " + age);
        }
    }
}

public class InnerClass {
    public static void main() {

        A obj1 = new A();
        obj1.show();
        A.B obj2 = obj1.new B();
        obj2.showInner(12);
    }

}
