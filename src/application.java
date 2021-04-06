import javax.naming.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class application {

    private static ArrayList<String> Names = new ArrayList<>(Arrays.asList("Pizza", "Burger"));
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = s -> System.out.println("i like " + s);
        Consumer<String> c3 = (s) -> System.out.print("i like " + s + " and " );
        Consumer<String> c4 = s -> {
            Names.forEach(c3.andThen(s1 -> {c1.accept(s);}));
        };
        Predicate<Integer> isEven = i -> i%2==0;
  

        if (isEven.test(4)){
            Names.forEach(c4);
        }

    }
}
