import java.lang.Math;

abstract class Shape
{
    protected int val1;
    protected int val2;
   
    Shape(int val1,int val2)
    {
        this.val1=val1;
        this.val2=val2;
    }
    abstract void printArea();
}
class Rectangle extends Shape
{
    int area;
    Rectangle(int val1,int val2)
    {
        super(val1,val2);
    }
    void printArea()
    {
        area=val1*val2;
        System.out.println("Area of the rectangle:"+area);
    }
}
class Triangle extends Shape
{
    double area;
    Triangle(int val1,int val2)
    {
        super(val1,val2);
    }
    void printArea()
    {
        area=0.5*val1*val2;
        System.out.println("Area of the Triangle:"+area);
    }
}
class Circle extends Shape
{
    double area;
    Circle(int val1,int val2)
    {
        super(val1,0);
    }
    void printArea()
    {
        area=Math.PI*val1*val1;
        System.out.println("Area of the circle:"+area);
    }
}
public class Test
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle(12,6);
        r.printArea();
        Triangle t=new Triangle(34,6);
        t.printArea();
        Circle c=new Circle(67,0);
        c.printArea();
    }
}
