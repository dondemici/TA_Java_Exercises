package Arrays;

import java.util.*;
public class ArrayListMoreDemo {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(23.3);
        System.out.println(nums);
        nums.set(1,33.5);
        System.out.println(nums);
        nums.remove(23.3);
        System.out.println(nums);
    }
}
