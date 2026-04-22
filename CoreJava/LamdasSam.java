package CoreJava;

@FunctionalInterface
interface A
{
    void show(int a);
}

public class LamdasSam {
    public static void main(String[] args){
        // Lamda Expression in Functional interfaces
        A obj = (a) -> System.out.println("Lamdas in Javad " + a);

        obj.show(89);
    } 
}
