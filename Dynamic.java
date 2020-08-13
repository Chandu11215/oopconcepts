class A
{
 void m1()
{
 System.out.println("A is related to m1");
}
}
class B extends A
{
 void m1()
{
 System.out.println("B is related to m1");
}
}
class C extends A
{
 void m1()
{
 System.out.println("C is related to m1");
}
}
class Dynamic
{
public static void main(String[] args)
{
 A a = new A();
 B b = new B();
 C c = new C();

 A ref;
 ref = a;
 ref.m1();
 ref = b;
 ref.m1();
 ref = c;
 ref.m1();
}
}

