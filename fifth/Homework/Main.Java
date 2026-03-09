package fifth.Homework;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop(10);

        shop.addProduct("Apple", 500);
        shop.addProduct("Banana", 300);
        shop.addProduct("Milk", 800);

        shop.printAll();

        shop.removeById(2);

        System.out.println();

        shop.printAll();

        shop.updatePriceById(1, 900);

        System.out.println();

        shop.printAll();
    }
}