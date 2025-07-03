package Arrays;
import java.util.*;
public class ArrayListOtherDemo {
    public static void main(String[] args) {
        int[] num ={12,13};
        int[] num2 = Arrays.copyOf(num,num.length);
        for (int i:num)
            System.out.println(i);
        for (int i:num2)
            System.out.println(i);
    }
}
