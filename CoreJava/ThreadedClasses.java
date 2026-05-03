package CoreJava;

class Ab extends Thread {
    public void run() {
        for (int i = 0; i <= 109; i++) {
            System.out.println("Hello AB");
        }
    }

}

class Cd extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Hello CD");
        }
    }

}

public class ThreadedClasses {
    public static void main(String[] args) {
        Ab obj1 = new Ab();
        Cd obj2 = new Cd();

        obj1.start();
        obj2.start();

    }

}
