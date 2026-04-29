package CoreJava;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message){
        super(message);
    }
} 

public class ExceptionAdvanced {
    // public static void checkAge(int age){
    //     if(age <18) {
    //         throw new InvalidAgeException("Age must be 18 or older");
    //     }
    // }
    public static void main(String[] args){
        int age = 76;
        try{
            if (age < 18)
                throw new InvalidAgeException("Age must be 18 or older");
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        
    }
}
