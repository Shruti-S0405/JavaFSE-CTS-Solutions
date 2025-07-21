import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] product = {
            new Product(101, "Smart Watch", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Mouse", "Electronics"),
            new Product(104, "Keyboard", "Electronics"),
            new Product(105, "Headset", "Electronics")
        } ;
        //Linear Search
        System.out.println("Linear Search Alogrithm to find the Product 'Phone' ");
        System.out.println(linearSearch(product, "Phone")!=null? linearSearch(product, "Phone"): "Product not Found");

        Arrays.sort(product);

         //Binary Search
        System.out.println("Binary Search Alogrithm to find the Product 'Phone' ");
        System.out.println(binarySearch(product, "Phone")!=null? binarySearch(product, "Phone"): "Product not Found");
    }


    public static Product linearSearch(Product[] product, String name){
        for(int i=0; i<product.length; i++){
            if(product[i].productName.equalsIgnoreCase(name)){
                return product[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] product, String name){
        int left = 0;
        int right = product.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            int cmp = name.compareToIgnoreCase(product[mid].productName);
            if(cmp==0) return product[mid];
            else if(cmp<0) right = mid-1;
            else left = mid+1;
        }
        return null;
    }
}
