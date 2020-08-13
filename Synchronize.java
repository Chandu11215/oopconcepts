class numtables
{
synchronized void printTable(int n)
{
System.out.println("the table threads");
for(int i=1;i<=5;i++)
{
System.out.println(n*i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class thread1 extends Thread
{
numtables t;
thread1(numtables t)
{
this.t=t;
}
public void run()
{
t.printTable(10);
}
}
class thread2 extends Thread
{
numtables t;
thread2(numtables t)
{
this.t=t;
}
public void run()
{
t.printTable(20);
}
}
public class Synchronize
{
public static void main(String[] args)
{
numtables n1 = new numtables();
thread1 t1=new thread1(n1);
thread2 t2=new thread2(n1);
t1.start();
t2.start();
}
}
