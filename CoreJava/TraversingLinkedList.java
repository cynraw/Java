
import java.util.LinkedList;

public class TraversingLinkedList{
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Oranges");
        fruits.add("Mangoes");
        fruits.add("Ovacado");

        //Getting first element
        String first = fruits.getFirst();
        System.out.println("Getting the first Element : " + first);

        //Getting last element 
        String last = fruits.getLast();
        System.out.println("Getting the last Element : " + last);

        //Getting an element at an index
        System.out.println("Element at 1st Index : " + fruits.get(1));


        //Enhanced for loop -- printing all elements in the linked list
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}