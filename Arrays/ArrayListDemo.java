package Arrays;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50};
        //int[] num1 =Arrays.clone(num);

        int [] num2=new int[num.length];


        for (int i = 0;i<num.length;i++)
        {
            num2[i]=num[i];
        }

        num[0]=25;

        System.out.println("Original copy");
        for (int i:num)
            System.out.println(i);
        System.out.println("Replicated copy");
        for (int i:num2)
            System.out.println(i);

        //for (int1=0,i)
        System.out.println("Sorted");
        Arrays.sort(num);
        for (int i:num)
        System.out.println(i);
        
    }
}
