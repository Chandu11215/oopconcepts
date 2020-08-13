import java.util.*;
class Member
{
String name;
int age;
String id;
 public Member(String name,int age,String id)
{
 this.name=name;
 this.age=age;
 this.id=id;
}
 void printSalary()
{
  System.out.println("this method prints salary");
}
}
class Employee extends Member
{
String phone;

 public Employee(String name,int age,String id,String phone)
{
  super(name,age,id);
   this.phone=phone;
}
 void printDetails()
{
  System.out.println("this prints details");
}
}
class Manager extends Member
{
String address;

public Manager(String name,int age,String id,String address)
{
    super(name,age,id);
     this.address=address;
}
}
public class MainMember
{
 public static void main(String args[])
{
   Manager m=new Manager("kalal",23,"65","address123");
        System.out.println("Name:"+m.name);
        System.out.println("Age:"+m.age);
        System.out.println("Id:"+m.id);
        System.out.println("Address:"+m.address);
           m.printSalary();
           
   Employee e=new Employee("chandu",24,"19","7893304150");
        System.out.println("name:"+e.name);
        System.out.println("Age:"+e.age);
        System.out.println("Id:"+e.id);
        System.out.println("phone:"+e.phone);
           e.printDetails();
           e.printSalary();
}
}
