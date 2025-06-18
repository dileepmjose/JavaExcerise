import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordLength {

    public static void main(String arg[]){
        String S[] = {"Jav","done","five","hoooo","Tinyyyy"};
        List<Integer> s2 = Arrays.stream(S).map(i->i.length()).collect(Collectors.toList());
        s2.forEach(System.out::println);

    }
}
