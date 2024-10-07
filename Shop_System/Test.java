import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop(new Person("Ali", "ali@gmail.com",new Address("London","UK")), new Address());
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("        Menu\n");
            System.out.println("1. Add Product\n2.Sale Product\n3.Display Product\n4.Update Product\n5.Delete Product\n0.Exit\n");
            System.out.println("Enter your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    shop.addProduct();
                    break;
                case 2:
                    shop.sale();
                    break;
                case 3:
                    shop.display();
                    break;
                case 4:
                    shop.update();
                    break;
                case 5:
                    shop.delete();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
            }
        }
    }
}
