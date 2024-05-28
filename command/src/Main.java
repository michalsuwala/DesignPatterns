import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String letter1 = "Letter for Amy";
        String letter2 = "Letter for Mark";
        List<String> letters = new ArrayList<>();
        Postman postman = new Postman(letters);
        letters.add(letter1);
        letters.add(letter2);
        Command command = new Deliver(postman);
        command.execute();
    }
}