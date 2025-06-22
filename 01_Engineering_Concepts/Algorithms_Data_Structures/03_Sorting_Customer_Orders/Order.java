class Order implements Comparable{
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice; 
    }

    public String toString(){
        return "{ OrderId: "+orderId+", Customer Name: "+customerName+ ", Total price: "+totalPrice+" }";
    }
}