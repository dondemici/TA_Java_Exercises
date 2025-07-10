package Folder2;
import java.util.*;


public class Program1 implements Comparator<String> {
    String first_name;
    String last_name;
    int age;
    public static void main(String[] args) {        
    String[] cityNam = {"Manila","Davao","Bacolod"};
    for (String city:cityNam)
    {
        System.out.println(city);
    }

    
    Arrays.sort(cityNam, new Program1());
    for (String city:cityNam)
    {
        System.out.println(city);
    }
    }

    public int compare(String s1, String s2){
        return s2.length()-s1.length();
    }
    

}



