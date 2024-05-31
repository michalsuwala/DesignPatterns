import java.util.Collections;
import java.util.List;

public class AscendingSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    protected void sortList(List<T> list) {
        Collections.sort(list);
    }
}
