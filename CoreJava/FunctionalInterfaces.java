package CoreJava;

@FunctionalInterface
interface A
{
    void show();
}


public class FunctionalInterfaces {
    public static void main(String[] args){
        A obj = new A(){
            public void show(){
                System.out.println("Anonymous method created out of a Single Abstract Method (SAM)");
            }
        };
        obj.show();
    }
}
