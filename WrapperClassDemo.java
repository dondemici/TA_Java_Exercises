public class WrapperClassDemo {
    public static void main(String[] args) {
        Integer num1=new Integer(10);
        Short num2=23; // autoboxing
        Long num3=Long.valueOf(12345671);
        Float num4=Float.valueOf(2.3f);
        System.out.println(num1);
        Float num5=Float.valueOf("2.3s");
        //Float num6=Double.valueOf("Dundee");
        
        // this will compile but will run into an exception (number format exception)

        int num7 = num1 + num2; //implicit unboxing
        String password="Cengage@123";
        char[]password_chars=password.toCharArray();
        int count=0;
        if(password.length()>=8 && password.length()<=16){
            for (int i = 0; i<password_chars.length;i++){
                if(Character.isLetter(password_chars[i]))
                count++;
            }
            System.out.println("");
        }
    }
}
