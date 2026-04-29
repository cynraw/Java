package CoreJava;

import java.util.Scanner;

class NoZeroException extends Exception {
    public NoZeroException(String message) {
        super(message);
    }
}

public class CustomizingExceptions {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the numerator: ");
        int x = sc.nextInt();

        System.out.println("Please Enter the denominator: ");
        int y = sc.nextInt();

        int result;

        try {
            if (y == 0)
                throw new NoZeroException("You cannot divide a number by zero");
            result = x / y;

            System.out.println("Result is : " + result);
        } catch (NoZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occured");
        }

    }

}
