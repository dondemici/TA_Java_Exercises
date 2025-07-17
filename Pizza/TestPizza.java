package Pizza;

import java.util.*;

public class TestPizza {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many toppings?");
        //String[]toppings = new String[n];
        int nooftoppings=input.nextInt();
        input.nextLine();
        String[]toppings =new String[nooftoppings];
        System.out.println("Enter toppings:");
        for(int i=0;i<toppings.length;i++){
            toppings[i]=input.nextLine();
        }
        Pizza pizza1 = new Pizza(toppings, nooftoppings);
        pizza1.displayPizza();
    }

}
