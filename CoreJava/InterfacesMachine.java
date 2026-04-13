package CoreJava;

interface Machine
{
    String start();
}


abstract class Appliance implements Machine
{
    String name;
    public Appliance(String name){
        this.name = name;
    }
}

class Fan extends Appliance
{
    public Fan(String name) {
        super(name);
    }

    public String start(){
        return "Fan is running";
    }
}

class WashingMachine extends Appliance
{
    public WashingMachine(String name){
        super(name);
    }

    public String start(){
        return "Washing Machine is operating";
    }
}


public class InterfacesMachine {
    public static void main(String[] args) {
        Machine fan = new Fan("Fan");
        Machine Washer = new WashingMachine("Washing Machine");
        System.out.println(fan.start());
        System.out.println(Washer.start());
    }
}