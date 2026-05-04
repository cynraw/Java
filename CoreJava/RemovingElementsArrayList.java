package CoreJava;

import java.util.ArrayList;
import java.util.List;

public class RemovingElementsArrayList {
    public static void main(String[] args){
        List<String> booksIEnjoy = new ArrayList<>();
        System.out.println(booksIEnjoy.isEmpty());

        booksIEnjoy.add("The Alchemist");
        booksIEnjoy.add("Zawadi yangu");
        booksIEnjoy.add("The Book store man");
        booksIEnjoy.add("The day I will never forget");
        booksIEnjoy.add("You are not your brain");
        booksIEnjoy.add("The 5am club");

        //Pass an index to the remove method
        booksIEnjoy.remove(1);
        System.out.println(booksIEnjoy);

        //pass an object to the remove method 
        booksIEnjoy.remove("The day I will never forget");
        System.out.println(booksIEnjoy);

        //Using removeAll method, create a sublistof the arrayList then use removeAll method
        List<String> subBooksIEnjoy = new ArrayList<>();
        subBooksIEnjoy.add("The Alchemist");
        subBooksIEnjoy.add("The Book store man");

        booksIEnjoy.removeAll(subBooksIEnjoy);
        System.out.println(booksIEnjoy);

    }
}
