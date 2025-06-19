import java.util.*;
public class Main{
    static int pId = 1;
    static HashMap<Integer, Product> inventory = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean flag = true;
        while(flag){
            System.out.println("Welcome to the Inventory Management System \n" +
                    "0. Exit \n" +
                    "1. Add a Product \n" +
                    "2. Update a Product \n" +
                    "3. Delete a Product \n" +
                    "4. View all Products \n"
            );
            value = sc.nextInt();
            switch(value){
                case 0:
                    flag = false;
                    System.out.println("Exiting... Thank you!");
                    break;
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    updateProduct(sc);
                    break;
                case 3:
                    deleteProduct(sc);
                    break;
                case 4:
                    viewProducts(sc);
                    break;
            }
        }
    }
    public static void addProduct(Scanner sc){
        System.out.println("Enter the name of the product to add:");
        String name = sc.next();
        System.out.println("Enter the price: ");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();
        Product p = new Product(pId, name, quantity, price);
        inventory.put(pId, p);
        pId++;
        System.out.println("Product added successfully!");
    }

    public static void updateProduct(Scanner sc){
        System.out.println("Enter the Product ID to update: ");
        int id = sc.nextInt();
        if(inventory.containsKey(id)){
            System.out.println("Enter the new price: ");
            double price = sc.nextDouble();
            System.out.println("Enter the new quantity: ");
            int quantity = sc.nextInt();
            Product p = inventory.get(id);
            p.price = price;
            p.quantity = quantity;
            System.out.println("Item added successfully");
        }
        else{
            System.out.println("ID not Found :(");
        }
    }

    public static void deleteProduct(Scanner sc){
        System.out.println("Enter the product ID to be deleted");
        int id = sc.nextInt();
        if(inventory.containsKey(id)){
            inventory.remove(id);
            System.out.println("Successfully removed the Product from the Inventory!");
        }
        else{
            System.out.println("ID not found");
        }
    }

    public static void viewProducts(Scanner sc){
        for(Product p: inventory.values()){
            System.out.println(p);
        }
    }
}
