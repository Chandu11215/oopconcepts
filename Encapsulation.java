class Encapsulate
{
  private String geekName;
  private int geekRoll;
  private int geekAge;

public String getName()
{
 return geekName;
}
public int getRoll()
{
 return geekRoll;
}
public int getAge()
{
 return geekAge;
}
public void setName(String newName)
{
 geekName = newName;
}
public void setRoll(int newRoll)
{
 geekRoll = newRoll;
}
public void setAge(int newAge)
{
 geekAge = newAge;
}
}
class Encapsulation
{
public static void main(String[] args)
{
  Encapsulate e=new Encapsulate();
  e.setName("chandu");
  e.setRoll(54);
  e.setAge(23);
System.out.println("Geeks name : " + e.getName());
System.out.println("Geeks roll : " + e.getRoll());
System.out.println("Geeks Age  : " + e.getAge());
}
}

