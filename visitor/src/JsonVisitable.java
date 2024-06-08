import org.json.JSONArray;

public class JsonVisitable implements Visitable {
    private JSONArray jsonArray;

    public JsonVisitable(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public JSONArray getJsonArray() {
        return jsonArray;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}