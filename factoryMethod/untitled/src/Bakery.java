public class Bakery {

    public static void main(String[] args) {
        Baker breadBaker = new BreadBaker();
        Baker cakeBaker = new CakeBaker();
        Product bread = breadBaker.bake();
        Product cake = cakeBaker.bake();

        System.out.println(bread.returnType());
        System.out.println(cake.returnType());
    }
}
