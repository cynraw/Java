
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ronoh", "Cheptanui", "Julie", "Jeniffer", "Chepkorir");

        System.out.println("Original names: " + names);

        List<String> s1 = names.stream()
                            .filter(n -> n.length() > 5)
                            .map(n -> n.toUpperCase())
                            .collect(Collectors.toList());

        System.out.println("Streamed list: " + s1);
    }
}
