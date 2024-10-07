import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    private static int counter=0;

    Product(String name, double price, int quantity){
        id= String.format("%03d",++counter);
        setName(name);
        this.price=price;
        this.quantity=quantity;
    }

    Product(String name, double price){
        this(name,price, 0);
    }

    Product(String name){
        this(name,0);
    }

    Product(){
        this("No Name");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null && name.length()>2)
            this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return String.format("Id: %s\n Name: %s\n Price: %.2f\n Quantity: %d\n",id,name,price,quantity);
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null|| getClass()!=obj.getClass()) return false;
        Product temp = (Product) obj;
        return Objects.equals(id,temp.id);
    }
}
