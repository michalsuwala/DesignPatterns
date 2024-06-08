import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class DataFormatterVisitor implements Visitor {
    private List<Map<String, Object>> formattedList;

    public DataFormatterVisitor() {
        formattedList = new ArrayList<>();
    }

    public List<Map<String, Object>> getFormattedList() {
        return formattedList;
    }

    @Override
    public void visit(JsonVisitable jsonVisitable) {
        JSONArray jsonArray = jsonVisitable.getJsonArray();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            formattedList.add(jsonObject.toMap());
        }
    }

    @Override
    public void visit(CsvVisitable csvVisitable) {
        List<String[]> csvData = csvVisitable.getCsvData();
        if (csvData.size() > 1) {
            String[] headers = csvData.get(0);
            for (int i = 1; i < csvData.size(); i++) {
                String[] row = csvData.get(i);
                Map<String, Object> rowMap = new HashMap<>();
                for (int j = 0; j < headers.length; j++) {
                    rowMap.put(headers[j], row[j]);
                }
                formattedList.add(rowMap);
            }
        }
    }
}
