import java.io.*;
class Bank
{
 private String name;
  Bank(String name)
{
  this.name=name;
}
public String getBankName()
{
 return this.name;
}
}
class Employee
{
 private String name;
 Employee(String name)
{
 this .name=name;
}
public String getEmployeeName()
{
  return this.name;
}
}
class Association
{
public static void main(String[] args)
{
  Bank bank = new Bank("Axis");
  Employee emp = new Employee("chandu");
  System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
}
}

