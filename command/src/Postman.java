import java.util.List;

public class Postman {
    private List<String> letters;

    public Postman(List<String> letters) {
        this.letters = letters;
    }

    public void deliverLetters() {
        for (String letter : letters) {
            System.out.println(letter + " delivered.");
        }
    }
}
