package Arrays;
import java.util.*;
public class ArrayListAnotherDemo {
    public static void main(String[] args) {
        
    ArrayList<String> listofGuests = new ArrayList<>(50);
    System.out.println(listofGuests.isEmpty());
    listofGuests.add("Dundee");
    listofGuests.add(0,"Mike");
    ArrayList<String> listofStudents = new ArrayList<>();
    listofStudents.add("Angel");
    listofStudents.add("Michie");
    listofGuests.addAll(listofStudents);
    System.out.println(listofGuests.size());
    
    if(listofGuests.contains("Angel"))
        listofGuests.remove("Angel");
    
    System.out.println(listofGuests.size());

    //iterator
    Iterator<String> itr = listofGuests.iterator();

    while(itr.hasNext())
    {
        String s=itr.next();
        System.out.println(s);
    }

    System.out.println(listofGuests.get(2));
    System.out.println(listofGuests.get(listofGuests.size()-1));

    ArrayList<Integer> numero = new ArrayList<Integer>();
    numero.add(1);
    numero.add(new Integer(10));
    Object[]nums=numero.toArray();

    for(Object i:nums)
    System.out.println(nums);

    }
}
