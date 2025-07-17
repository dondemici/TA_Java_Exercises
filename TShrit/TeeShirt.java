public class TeeShirt {
    
    private String Order_Number;
    private String color;
    private String size;
    public double price;
    
    public TeeShirt(String order_Number, String color, String size) {
        Order_Number = order_Number;
        this.color = color;
        this.size = size;

        if(size.equalsIgnoreCase("XS")||size.equalsIgnoreCase("S")||size.equalsIgnoreCase("M"))
        this.price = 19.99;
        else if(size.equalsIgnoreCase("L")||size.equalsIgnoreCase("XL")||size.equalsIgnoreCase("XXL"))
        this.price = 22.99;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
   
    
    public String getOrder_Number() {
        return Order_Number;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public void setOrder_Number(String order_Number) {
        Order_Number = order_Number;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "Order #: " + Order_Number +"\nColor: "+ color +"\nSize: "+ size+"\nPrice: " + price;
    }
}
