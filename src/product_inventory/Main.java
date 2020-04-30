package product_inventory;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        inventory.addProduct("Coke", new Product(5, "Coke", 50));
        inventory.addProduct("Sprite", new Product(4, "Sprite", 50));
        inventory.printInventory();
        System.out.println("----------");

        inventory.buy("Coke", 25);
        System.out.println("----------");
        inventory.printInventory();
        System.out.println("----------");

        inventory.buy("Coke", 50);
        inventory.printInventory();

        inventory.removeProduct("Sprite");

        inventory.addProduct("Coke", new Product(5, "Coke", 25));

        inventory.printInventory();
        System.out.println(inventory.getInventoryValue());
    }
}
