package CoreJava;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework {
    public static void main(String[] args){
        
        Collection<String> fruitCollections = new ArrayList<>();
        fruitCollections.add("Mango");
        fruitCollections.add("Banana");
        fruitCollections.add("Apple");
        fruitCollections.add("Pineapple");

        System.out.println(fruitCollections);

        fruitCollections.remove("Pineapple");
        
        System.out.println(fruitCollections);

        System.out.println(fruitCollections.contains("pineapple"));

        fruitCollections.forEach((element) ->{
            System.out.println(element);
        });

        fruitCollections.clear();

        System.out.println(fruitCollections);
    }
}
