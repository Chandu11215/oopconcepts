class Rectangle
{
  double length;
  double breadth;

Rectangle(double length,double breadth)
{
  this.length=length;
  this.breadth=breadth;
}
 void printArea()
{
 double area=length*breadth;
 System.out.println("the area of rectangle is:"+area);
}
 void printPeri()
{
 double peri=2*(length+breadth);
 System.out.println("the peri of rectangle is:"+peri);
}
}
class square extends Rectangle
{
  square(double s)
{
  super(s,s);
}
 void printArea()
{
  super.printArea();

}
 void printPeri()
{
 double peri=4*length;
 System.out.println("the peri of rectangle is:"+peri); 
}
}
public class Size
{
public static void main(String args[])
{
  Rectangle r=new Rectangle(10,10);
    r.printArea();
    r.printPeri();
  square s=new square(4);
   s.printArea();
   s.printPeri();
}
}


