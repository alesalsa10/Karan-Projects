package product_inventory;

public class Product {
    private int price;
    private String id;
    private int quantity;

    public Product(int price, String id, int quantity){
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }
    public String getId(){
        return this.id;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void reduceQuantity(int value){
        if (this.quantity >= value){
            this.quantity -= value;
        } else {
            System.out.println("You got " + this.quantity + " items as that is all we have available at the moment");
            this.quantity = 0;
        }
    }
    public void increaseQuantity(int value){
        this.quantity += value;
    }
    public int getPrice(){
        return this.price;
    }
    public String toString(){
        return "Name: " + this.id + " Price: " + this.price + " dollars " + " Quantity: " + this.quantity;
    }


}
