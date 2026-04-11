package CoreJava;
class Calc{
    String s = "Hello Classes";
    public int calc(int a, int b){
        int result = a + b;
        return result;
    }
}

public class Calculator{
    public static void main(){
        int a = 23;
        int b = 21;

        Calc calc1 = new Calc();
        int r = calc1.calc(a, b);
        System.out.println(r);
    }
}