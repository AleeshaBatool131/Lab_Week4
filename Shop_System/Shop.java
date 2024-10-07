import java.util.Scanner;
public class Shop {
    private Person owner;
    private Address shopAddress;
    private Product[] productList = new Product[500];

    private static int productCount = 0;
    private static double revenue = 0;
    {
       productList[productCount++]=new Product("Keyboard",2000,10);
       productList[productCount++]=new Product("Mouse",3500,20);
       productList[productCount++]=new Product("Printer",3000,30);
       productList[productCount++]=new Product("Scanner",4000,40);
       productList[productCount++]=new Product("Monitor",5000,50);
       productList[productCount++]=new Product("Cable",6000,60);
       productList[productCount++]=new Product("Charger",700,70);
       productList[productCount++]=new Product("USB",800,80);
       productList[productCount++]=new Product("Mobile",9000,90);
    }

    public Shop(Person owner, Address address){
        this.owner = owner;
        this.shopAddress =address;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Address getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(Address shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Product[] getProductList() {
        return productList;
    }

    public void setProductList(Product[] productList) {
        this.productList = productList;
    }

    public int find(String id){
        int index = -1;
        for (int i=0; i<productCount; i++){
            if(productList[i].getId().equals(id)){
                index=i;
                break;
            }
        }
        return index;
    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Details");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextFloat();
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        productList[productCount++] = product;
        System.out.println("Product Added Successfully\n");
    }

    public void sale() {
        System.out.println("Sale Menu");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product ID: ");
        String id = sc.nextLine();
        int index = find(id);
        if (index!=-1){
            productList[index].setQuantity(productList[index].getQuantity() - 1);
            revenue += productList[index].getPrice();
            System.out.println("Sale Successful\n");
        }
        else{
            System.out.println("Product not Found\n");
        }

    }

    public void display() {
        try {
            System.out.println("Display Products");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Product ID: ");
            String id = sc.nextLine();
            int index = find(id);
            if (index != -1 && productList[index] != null) {
                System.out.println(productList[index]);
                System.out.println();
            }
        }
        catch(NullPointerException e) {
                System.out.println("Product not Found\n");
        }
    }

    public void update() {
        System.out.println("Update Products");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product ID");
        String id = sc.nextLine();
        int index = find(id);
        if (index!=-1){
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextFloat();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            productList[index].setName(name);
            productList[index].setPrice(price);
            productList[index].setQuantity(quantity);
            System.out.println("Update Successfully\n");
        }
        else{
            System.out.println("Product not Found\n");
        }
    }

    public void delete() {
        System.out.println("Delete Products");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product ID: ");
        String id = sc.nextLine();
        int index = find(id);
        if (index!=-1){
            productList[index] = null;
            System.out.println("Deleted Successfully\n");
        }

        else{
            System.out.println("Product not Found\n");
        }
    }
}

