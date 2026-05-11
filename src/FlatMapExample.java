import java.util.*;

public class FlatMapExample {
	
    public static void main(String[] args) {

        List<List<String>> names = Arrays.asList(Arrays.asList("A", "B"),Arrays.asList("C", "D"));

        names.stream().flatMap(x -> x.stream()).forEach(System.out::println);
             
     }
}