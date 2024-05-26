public class Main {
    public static void main(String[] args) {
        DatabaseProxy databaseProxy = new DatabaseProxy();
        System.out.println(databaseProxy.addProduct(477, "Strawberry ice cream", 46));
    }
}