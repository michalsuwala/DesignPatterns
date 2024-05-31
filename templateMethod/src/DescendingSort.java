import java.util.Collections;
import java.util.List;

public class DescendingSort <T extends Comparable<T>> extends Sort<T> {
    @Override
    protected void sortList(List<T> list) {
        list.sort(Collections.reverseOrder());
    }
}
