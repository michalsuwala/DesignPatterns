import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 6, 9, 6, 4, 1);

        Sort<Integer> ascendingSorter = new AscendingSort<>();
        ascendingSorter.sort(numbers);
        System.out.println(numbers);

        Sort<Integer> descendingSorter = new DescendingSort<>();
        descendingSorter.sort(numbers);
        System.out.println(numbers);
    }
}