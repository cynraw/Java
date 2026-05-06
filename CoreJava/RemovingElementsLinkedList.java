
import java.util.LinkedList;

public class RemovingElementsLinkedList{
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Oranges");
        fruits.add("Lime");
        fruits.add("Water Melon");
        fruits.add("Ovacado");

        System.out.println("All Elements: " + fruits);

        //Removing first element
        fruits.removeFirst();
        System.out.println("After removing first element : " + fruits);

        //Removing last element
        fruits.removeLast();
        System.out.println("After removing last element : " + fruits);

        //Removing at an index
        fruits.remove(1);
        System.out.println("After removing element at index 1 : " + fruits);
    }
}