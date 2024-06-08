public interface Visitor {
    void visit(JsonVisitable jsonVisitable);
    void visit(CsvVisitable csvVisitable);
}
