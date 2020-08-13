class A
{
 int x =10;
}
class B extends A
{
 int x = 20;
}
public class Test19
{
 public static void main(String[] args)
{
  A a = new B();
  System.out.println(a.x);
}
}
