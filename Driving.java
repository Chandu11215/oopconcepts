class Car
{
  int model,no;

 Car(int model,int no)
{
  this.model=model;
  this.no=no;
}
void Print()
{
 System.out.println("no =" +no  + ", model=" +model);
}
}
class Driving
{
public static void swap(Car c1,Car c2)
{
  Car temp = c1;
   c1 = c2;
   c2 = temp;
}
public static void main(String[] args)
{
  Car c1 = new Car(101,102);
  Car c2 = new Car(202,203);
   swap(c1,c2);
   c1.Print();
   c2.Print();
}
} 
