import java.util.List;

public class CsvVisitable implements Visitable {
    private List<String[]> csvData;

    public CsvVisitable(List<String[]> csvData) {
        this.csvData = csvData;
    }

    public List<String[]> getCsvData() {
        return csvData;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}