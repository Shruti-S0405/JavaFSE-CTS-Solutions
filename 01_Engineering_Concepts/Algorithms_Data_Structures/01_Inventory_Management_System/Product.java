class Product{
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return "{ Product ID: "+productId+ " , Product Name: "+productName+" , Quantity: " +quantity+ " ,Price "+price+" }";
    }
}
