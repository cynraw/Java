package CoreJava;
class Cars{
    public void drive(int speed){
        if(speed > 85){
            System.out.println("Heey ma'am, You know you can be prosecuted for that!!!!");
        } else{
            System.out.println("You good and jolly fellow, you can proceed nicely.");
        }
    }

    public double speedCalculator(double distance, int time){
        double speed = distance / time;
        return speed;
    }
    
} 

public class Demo1{

    public int Calculator(int a, int b){
            return a+b;
    }

    //Method overloading
    public double Calculator(double a, int b, int c){
            return a+b+c;
    }
        
    public static void main(){
        Cars car1 = new Cars();
        car1.drive(60);
        
        double speed = car1.speedCalculator(180, 3);
        System.out.println(speed);

        Demo1 obj = new Demo1();
        double sum = obj.Calculator(12,45,90);
        System.out.println(sum);
    }
}