import java.util.Objects;
public class Product{

	//Instance Variables
	private String name;
	private String id;
	private double price;
	private int quantity;

	// Class Variable
	private static int counter=0;
	
	Product(String name, double price,int quantity){
		setName(name);
		this.id=String.format("%03d",++counter);
		this.price=price;
		this.quantity=quantity;
	}
	Product(String name, double price){
		this(name,price,0);
	}
	Product(String name){	
		this(name,0);
	}
	Product(){
		this("No name");
	}

	public void setName(String name){
		if(name!=null && name.length()>2)
			this.name=name;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantity(){
		return quantity;
	}
	public String toString(){
		return String.format("Product ID: %s\nName: %-8s\nPrice: %.2f\nQuantity: %d", id, name, price, quantity);
	}
	@Override
	public boolean equals(Object obj){
		if (this==obj) return true;
		if (obj==null||getClass() != obj.getClass()) return false;
		Product temp = (Product) obj;
		return Objects.equals(id, temp.id);

	}
	
}