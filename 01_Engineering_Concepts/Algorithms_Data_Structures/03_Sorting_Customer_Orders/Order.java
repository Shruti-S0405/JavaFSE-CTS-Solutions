class Order implements Comparable{
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice; 
    }

    public int compareTo(Object o){
        Order order = null;
        if(o instanceof Order){
            order = (Order)o;
        }
        if(order == null) return 0;
        return (int)(this.totalPrice - order.totalPrice);
    }

    public String toString(){
        return "{ OrderId: "+orderId+", Customer Name: "+customerName+ ", Total price: "+totalPrice+" }";
    }
}