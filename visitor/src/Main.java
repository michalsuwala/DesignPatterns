import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(new JSONObject().put("name", "Alice").put("age", 30));
        jsonArray.put(new JSONObject().put("name", "Bob").put("age", 25));
        JsonVisitable jsonVisitable = new JsonVisitable(jsonArray);

        List<String[]> csvData = Arrays.asList(
                new String[]{"name", "age"},
                new String[]{"Alice", "30"},
                new String[]{"Bob", "25"}
        );
        CsvVisitable csvVisitable = new CsvVisitable(csvData);

        DataFormatterVisitor visitor = new DataFormatterVisitor();

        jsonVisitable.accept(visitor);
        csvVisitable.accept(visitor);

        List<Map<String, Object>> formattedList = visitor.getFormattedList();
        for (Map<String, Object> item : formattedList) {
            System.out.println(item);
        }
    }
}