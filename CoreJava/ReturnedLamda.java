package CoreJava;

@FunctionalInterface
interface A
{
    int add(int a, int b);
}

public class ReturnedLamda {
    public static void main(String[] args){
        A obj = (x, y) -> x + y;

        int result = obj.add(234, 890);

        System.out.println(result);
    }
    
}
