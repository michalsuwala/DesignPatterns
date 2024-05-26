public class DatabaseProxy implements DatabaseInterface {
    private Database database;


    @Override
    public String addProduct(int id, String name, int quantity) {
        if (database == null) {
            database = new Database();
        }
        return database.addProduct(id, name, quantity);
    }

    @Override
    public String getProducts() {
        if (database == null) {
            database = new Database();
        }
        return database.getProducts();
    }
}
