package CoreJava;

abstract class Employee1{
    abstract void contracts();

}

class It extends Employee1{
    public void contracts(){
        System.out.println("In It...");
    }
}

public class Abstraction1 {
    public static void main(String[] args){
        Employee1 obj1 = new It();
        obj1.contracts();
    }
}
