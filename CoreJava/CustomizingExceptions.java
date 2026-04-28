package CoreJava;

import java.util.Scanner;

class NoZeroException extends Exception {
    public NoZeroException(String message) {
        super(message);
    }
}

public class CustomizingExceptions {
    public static void main(String[] args) {
        System.out.println("Please Enter the first number you wish to add: ");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        System.out.println("Please Enter the second number you wish to add: ");
        Scanner b = new Scanner(System.in);
        int y = b.nextInt();
        int result;

        try {
            if (y == 0)
                throw new NoZeroException("You cannot divide a number by zero");
            result = x / y;

            System.out.println("Sum is : " + result);
        } catch (NoZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occured");
        }

    }

}
