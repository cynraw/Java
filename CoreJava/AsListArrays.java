package CoreJava;

import java.util.Arrays;
import java.util.List;

public class AsListArrays {
    public static void main(String[] args){
        List<String> animals = Arrays.asList("cow", "dog", "cat", "crocodile");

        for(String animal : animals){
            System.out.println(animal);
        }
        
    }
}
