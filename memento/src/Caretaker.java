import java.util.Stack;

public class Caretaker {
    private final Stack<RGBColor.Memento> mementos = new Stack<>();

    public void saveState(RGBColor rgbColor) {
        mementos.push(rgbColor.save());
    }

    public void restoreState(RGBColor rgbColor) {
        if (!mementos.isEmpty()) {
            rgbColor.restore(mementos.pop());
        } else {
            System.out.println("No states to restore.");
        }
    }
}
