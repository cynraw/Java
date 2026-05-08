
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetInterface{
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();

        //Sets do not allow duplicates only one entry is printed out
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        //sets allows only one record of a null value
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        System.out.println(numbers);

        //Creating a set out of another collection
        List<String> fruits = Arrays.asList("Mango", "Banana", "Oranges", "Mango", "Mango", "Melon");
        Set<String> setFruits = new HashSet<>(fruits);
        System.out.println(setFruits);  

        LinkedList<String> newList = new LinkedList();
        newList.add("Ovacado");
        newList.add("Strawberry");
        newList.add("Ovadusdus");

        setFruits.addAll(newList);
        System.out.println(setFruits);
           

    }
}