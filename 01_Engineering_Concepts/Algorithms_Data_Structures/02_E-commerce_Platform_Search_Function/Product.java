public class Product implements Comparable{
    int productId;
    String productName;
    String category;

    Product(int id, String name, String category){
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public int compareTo(Object o){
        Product p = null;
        if(o instanceof Product) p = (Product)o;
        if(p==null) return 0;
        return this.productName.compareTo(p.productName);
    }

    @Override
    public String toString(){
        return "{ Product ID: "+productId+ " , Product Name: "+productName+" , Category: " +category+ " }";
    }
}
