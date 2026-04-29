package CoreJava;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionExercise {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int numerator = a.nextInt();
        Scanner b = new Scanner(System.in);
        int denominator = a.nextInt();
        int result;

        try{
            result = numerator/denominator;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e){
            System.out.println("Unknown error occurred");
        }


        System.out.println("Program executed successfully");
    }
}
