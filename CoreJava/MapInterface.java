
import java.util.HashMap;
import java.util.Map;

public class MapInterface{
    public static void main(String[] args){
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Ronoh", 96);
        studentMarks.put("Sharon", 90);
        studentMarks.put("Sheilah", 92);
        studentMarks.put("Julie", 94);
        studentMarks.put("Jennifer", 98);
        studentMarks.put("Hillary", 95);

        //Printing the key - value pairs
        System.out.println(studentMarks);

        //Printing a given key returns the value for it
        System.out.println(studentMarks.get("Julie"));

        //Iterating over a map using enhaced for loop
        for(String name : studentMarks.keySet()){
            System.out.println(name + " : " + studentMarks.get(name));
        }

    }
}