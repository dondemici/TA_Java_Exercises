package Pizza;

import java.util.*;

//collection and inheritance together

class Pizza {
    
    private ArrayList<String> toppingsAvailable;
    private String description="";
    private double price;
    final double baseprice=14.00;
    final int priceeachtopping = 2;

    public Pizza(String[]toppings, int nooftoppings){ //nooftoppings determine price
        for(String s: toppings)
        {
            description+=s+",";
        }
        this.price=baseprice+nooftoppings*priceeachtopping;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
    
    void displayPizza()
    {
        System.out.println("Pizza details: "+ description);
        System.out.println("Total: "+ price);
    }

}
