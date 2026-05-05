package CoreJava;

import java.util.Arrays;
import static java.util.Collections.sort;
import static java.util.Collections.reverse;
import java.util.List;

public class SortingArrayListIntegers {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(12,30,67,1,4,79);
        sort(numbers);   //Ascending order
        System.out.println(numbers);

        reverse(numbers); //Descending order
        System.out.println(numbers);
    }
}
