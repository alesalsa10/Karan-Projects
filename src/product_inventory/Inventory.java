package product_inventory;
import java.util.Map;
import java.util.HashMap;

public class Inventory {
    private Map<String, Product> items;

    public Inventory(){

        this.items = new HashMap<>();
    }

    public void addProduct(String item, Product product){
        if (items.containsKey(item)){
            items.get(item).increaseQuantity(product.getQuantity());
        } else {
            items.put(product.getId(), product);
        }
    }
    public void removeProduct(String product){
        if (items.containsKey(product)){
            if(items.get(product).getQuantity() < 1){
                items.remove(product);
                System.out.println("Product removed");
            } else
                System.out.println("We still have plenty of " + items.get(product).getId() + " in inventory, it is not adviced to remove it");
        }
    }
    public void printInventory(){
        for (Product product: items.values()){
            System.out.println(product);
        }
    }
    public void buy(String product, int amount){
        if (items.containsKey(product)){
            items.get(product).reduceQuantity(amount);
        } else {
            System.out.println("Product not available");
        }
    }

    public int getInventoryValue(){
        int sum = 0;
        for (Product product: items.values()){
            int totalValuePerProduct = product.getQuantity() * product.getPrice();
            sum += totalValuePerProduct;
        }
        return sum;
    }

}
