public class WrapperClassDemo {
    public static void main(String[] args) {
        Integer num1=new Integer(10);
        Short num2=23; // autoboxing
        Long num3=Long.valueOf(12345671);
        Float num4=Float.valueOf(2.3f);
        System.out.println(num1);
        Float num5=Float.valueOf("2.3s");
        Float num6=Double.valueOf("Dundee");
        
        // this will compile but will run into an exception (number format exception)
    }
}
