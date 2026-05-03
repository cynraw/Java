package CoreJava;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //List allows addition of duplicate values
        list.add("Element1");
        list.add("Element1");

        System.out.println(list);

        //Allows addition of nulls
        list.add(null);

        System.out.println(list);

        //Accessing an element in a list using the index
        System.out.println(list.get(1));
        
    }
}

