package CoreJava;

public class ThrowKeyword {
    public static void main(String[] args){
        int a = 12;
        int b = 1;
        int result;

        try{
            result = a/b;
            if(b==1) throw new ArithmeticException("We would not dive the number by 1");
        }
        catch(ArithmeticException e){
            result = a/2;
            System.out.println("Sorry lad this is the default value" + " " + e.getMessage());
        }

        System.out.println(result);
    }
}
