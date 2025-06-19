public class Conversion {
    public static void main(String[] args){
    //item1
        //String result = "Excellent";
        //int i = 5;
        //do{
        //    result = "Very Good";
        //    System.out.println("The performance is "+result);
        //    i--;
        //}while (i >= 1);
        int sum = 0;
    
    //item2
    //Scenario 1: variable is initialized inside a loop
    //int i = 0; 
    //for (i = 0; i < 5; i++) {
    //  int total = 0;
    //  sum += 10;
    //  total = sum;
    //}
    //System.out.println("The total to be paid is " + total);

    //item3
    //int x = 3264;
    //int y = x % 10;
    //x = x/10;
    //System.out.println(x+" " +y);
    
    //item4
    //boolean even = false;
    //if (even){
    //    System.out.println("It is even!");
    //}


    int x = 3;
    int y = 4;
    switch (x + 3){
        case 6:
            y = 0;
            break;
        case 7:
            y = 1;
        default:
            y += 1;
            break;
        }
    System.out.println(x);
    System.out.println(y);
}
}
