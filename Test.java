public class Test {
    /*public static void main(String[] args) {
    System.out.println(xMethod(10, 15));
    System.out.println("Method Invocation");
 
  }
 
  public static int xMethod(int n, double l) {
    System.out.println("int, double");

    return n;
    }*/
    /*public static void main(String[] args) {
    System.out.println(max(15, 2));
  }
 
  public static double max(int num1, double num2) {
    System.out.println("max(int, double) is invoked");
 
    if (num1 > num2)
      return num1;
    else
      return num2;
  }
 
  public static double max(double num1, int num2) {
    System.out.println("max(double, int) is invoked");
 
    if (num1 > num2)
      return num1;
    else
      return num2;
 
  }*/

/*static int marks=0;
   public void increment()
   {
       marks++;
   }
   public static void main(String args[])
   {
       Test a1 = new Test();
       Test a2 = new Test();
       a1.increment();
       a2.increment();
       a2.increment();
       System.out.println("A1: marks are = " + a1.marks);
       System.out.println("A2: marks are = " + a2.marks);
   }*/

    /*static int i = 10;
  static String s = "static";
  
  static void display()
  {
     System.out.println("i = "+ i);
     System.out.println("s = "+ s);
  }
  void func()
  {
      display();
  }
 
  
  public static void main(String args[])
  {
      Test obj = new Test();
 
      obj.func();
      display();
   }*/
   private int a;
 
 
  public Test(int first)
 
 
  {
 
 
    this.a = first;
 
 
  }
 
 
}
 
 
public class MyClassTester
 
 
{
 
 
  public static void main(String[] args)
 
 
  {
 
 
    Test c1 = new Test(30);
 
 
    System.out.println(c1.a);
 
 
  }


}
