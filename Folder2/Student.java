package Folder2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;

public class Student {
    String first_name;
    String last_name;
    int age;

    public Student(String first_name, String last_name, int age){
        this.last_name = last_name;
        this.first_name = first_name;
        this.age = age;
    }
    @Override
    public String toString() {
        return first_name + " " + last_name + ", age " + age;
    }

    public static void main(String[] args) {
        ArrayList<Student> listofstu = new ArrayList<>();
        listofstu.add(new Student("Favor","Otas",28));
        listofstu.add(new Student("Jordan","Michael",25));
        Collections.sort(listofstu, new AgeComparator());  
        
        // Sort by age using AgeComparator
        //listofstu.sort(new AgeComparator());

        Iterator<Student> itr = listofstu.iterator();
        while (itr.hasNext())
        {
            Student s = itr.next();
            System.out.println(s.age);
        }
        // Print sorted list
        //for (Student s : listofstu) {
        //    System.out.println(s);
        //}

    }
}

class AgeComparator implements Comparator<Student>
{
    @Override
    public int compare(Student p1, Student p2) {
        return Integer.compare(p1.age, p2.age); // ascending order
    }
}   