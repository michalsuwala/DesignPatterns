import java.util.List;

abstract class Sort<T extends Comparable<T>> {

    public void sort(List<T> list) {
        sortList(list);
    }

    protected abstract void sortList(List<T> list);
}
