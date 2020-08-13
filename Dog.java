class Dog
{
  String name;
  String breed;
  int age;
  String color;
public Dog(String name,String breed,int age,String color)
{
  this.name=name;
  this.breed=breed;
  this.age=age;
  this.color=color;
}
 public String getName()
{
  return name;
}
 public String getBreed()
{
  return breed;
}
 public int getAge()
{
  return age;
}
public String getColor()
{
  return color;
}
public String toString()
{
return("my name is " +this.getName() + ".\nmy breed,age,color are " +this.getBreed()+","+this.getAge()+","+this.getColor());
}
public static void main(String[] args)
{
  Dog stuffy=new Dog("chotu","GermanShepperd",23,"black");
   System.out.println(stuffy.toString());
} 
}
