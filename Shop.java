import java.util.Scanner;

public class Shop{
	private String address;
	private Person owner;
	private Product productList[]= new Product[500];

	private static int productCount = 0;
	private static double revenue=0;
	public Shop(Person owner, String address){
		this.owner = owner;
		this.address=address;
		this.productList= new Product[100];
	}
	
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Product[] getProductlist() {
        return productList;
    }

    public void setProductList(Product[] productlist) {
        this.productList = productlist;
    }
	
	public void addProduct(){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter Product Details");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextFloat();
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		productList[productCount++]=product;
		System.out.println("Product Added Successfully");
		
	}
	public void sale(){
		System.out.println("Sale Menu");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID: ");
		String id = sc.nextLine();
		boolean found = false;
		for(int i=0; i<productCount; i++){
			if(productList[i].getId().equals(id)){
				productList[i].setQuantity(productList[i].getQuantity()-1);
				revenue+=productList[i].getPrice();
				System.out.println("Sale Successfull");
				found = true;
				break;
			}
			if(!found){
				System.out.println("Product not Found");
			}
		}
	}
	public void display(){
		System.out.println("Display Products");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID: ");
		String id = sc.nextLine();
		boolean found = false;
		for(int i=0; i<productCount; i++){
			if(productList[i]!=null && productList[i].getId().equals(id)){
				System.out.println(productList[i]);
				System.out.println();
				found = true;
				break;
			}
		}
		if(!found){
				System.out.println("Product not Found");
		}
	}
	public void update(){
		System.out.println("Update Products");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID");
		String id = sc.nextLine();
		boolean found = false;
		for(int i=0; i<productCount; i++){
			if(productList[i].getId().equals(id)){
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Price: ");
				double price = sc.nextFloat();
				System.out.println("Quantity: ");
				int quantity = sc.nextInt();
				productList[i].setName(name);
				productList[i].setPrice(price);
				productList[i].setQuantity(quantity);
				found = true;
				break;
			}
			
		}
		if(!found){
				System.out.println("Product not Found");
		}
	}
	public void delete(){
		System.out.println("Delete Products");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID: ");
		String id = sc.nextLine();
		boolean found = false;
		for(int i=0; i<productCount; i++){
			if(productList[i].getId().equals(id)){
				productList[i]=null;
				System.out.println("Deleted Successfully");
				found = true;
				break;
			}
			
		}
		if(!found){
				System.out.println("Product not Found");
		}
	}





}