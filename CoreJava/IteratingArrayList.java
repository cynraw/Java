package CoreJava;

import java.util.Arrays;
import java.util.List;

public class IteratingArrayList {
    public static void main(String[] args){
        List<String> fruitsList = Arrays.asList("Banana", "Apple", "Mango", "Ovacado", "Water melon");

        //Using basic loop
        for(int i=0; i<fruitsList.size(); i++){
            System.out.println(fruitsList.get(i));
        }

        //Using enhanced for loop
        for (String fruit : fruitsList){
            System.out.println(fruit);
        }

        //using java 8 stream + lamda
        fruitsList.stream().forEach(course -> System.out.println(course));

        //Using forEach + lamda
        fruitsList.forEach(course -> System.out.println(course));
    }
}
