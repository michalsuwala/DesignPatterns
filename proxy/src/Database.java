public class Database implements DatabaseInterface {
    public Database() {
    }

    @Override
    public String addProduct(int id, String name, int quantity) {
        return "Product added";
    }

    @Override
    public String getProducts() {
        return "Retrieving products...";
    }
}
