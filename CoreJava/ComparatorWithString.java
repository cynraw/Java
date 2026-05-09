
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithString {

    public static void main(String[] args) {

        //Comparator to compare two strings based on length
        //    Comparator<String> comp = new Comparator<> (){
        //         public int compare(String a, String b){
        //           if(a.length() > b.length())
        //             return 1;
        //           else 
        //             return -1;  
        //         }
        //    };
        
        Comparator<String> comp = (a, b) -> {
            if (a.length() > b.length()) {
                return 1; 
            }else {
                return -1;
            }
        };

        List<String> names;
        names = new ArrayList<>();
        names.add("Ronoh");
        names.add("Sharon");
        names.add("Sheilah");
        names.add("Julie");
        names.add("Jennifer");
        names.add("Hillary");

        Collections.sort(names, comp);

        System.out.println(names);
    }
}
