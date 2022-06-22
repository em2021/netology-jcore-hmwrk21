import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveInts = new ArrayList<>();
        List<Integer> evenInts = new ArrayList<>();
        intList.forEach(x -> {
            if (x > 0) {
                positiveInts.add(x);
            }
        });
        positiveInts.forEach(x -> {
            if (x % 2 == 0) {
                evenInts.add(x);
            }
        });
        Collections.sort(evenInts, Comparator.naturalOrder());
        System.out.println(evenInts);
    }
}