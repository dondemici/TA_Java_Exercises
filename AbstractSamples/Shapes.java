package AbstractSamples;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Shapes {
    
    private int length;
    private int width;
    private int area;

    Shapes(){}
    Shapes(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

void displayShape(){

}

}

class Rectangle extends Shapes{
    Rectangle(int len, int wid)
{
super(len, wid);
}
public void area(){
    int areaofshape=getLength()+getWidth();
    this.setArea(areaofshape);
    System.out.println("Area Shape"+ this.getArea());
}

public void perimeter(){
    int perimeterofshape=2 *getLength() +getWidth();
    this.setPerimeter(perimeterofshape);
    System.out.println("Area Shape"+ this.getPerimeter());
}


class Square extends Shapes{
    Square(int len){
        this.setLength(len);

    }
public void area(){
    int areaofshape=getLength()+getWidth();
    this.setArea(areaofshape);
    System.out.println("Area Shape"+ this.getArea());
}

public void perimeter(){
    int perimeterofshape=4*getLength();
    this.setPerimeter(perimeterofshape);
    System.out.println("Area Shape"+ this.getPerimeter());
}


}
}


class TestShapes{
    public static void main(String[] args) {
        ArrayList<Shapes> listofshapes = new ArrayList<>();
        listofshapes.add(new Rectangle(10, 20));
        listofshapes.add(new Square(25));
    }

    Iterator<Shapes> itr=listofshapes.iterator();
    while(itr.hasNext())
    {
        Shapes s=itr.next();
        if(s instanceof Rectangle)
        {
            ((Rectangle))
        }
    }
}