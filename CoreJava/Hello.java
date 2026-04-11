package CoreJava;
public class Hello{
    public static void main(String args[]){
       
        int numbers [] [] = new int [3] [4];

        double results [] = {2.5 , 3.7 , 5.9 , 6.5};
        for(int i = 0; i<results.length; i++){
            System.out.println(results[i]);
        }
        
        for (int i= 0; i < 3; i++){
            for (int j = 0; j<4; j++){
                numbers [i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i= 0; i < 3; i++){
            for (int j = 0; j<4; j++){
                System.out.print(numbers[i] [j] + " ");
            }
            System.out.println();
        }
        
    }
}