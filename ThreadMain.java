class ThreadA extends Thread
{
  public void run()
{
   int i;
   for(i=1;i<=10;i++)
{
   System.out.println("Thread A in for loop i="+i);
}
try
{
   Thread.sleep(400);
}
catch(Exception e)
{  
   System.out.println(e);
}
}
}
class ThreadB extends  Thread
{
  public void run()
{
   int j;
   for(j=1;j<=10;j++)
{
System.out.println("Thread B in for loop j=" +j);
}
try
{
  Thread.sleep(500);
}
catch(Exception e)
{
   System.out.println(e);
}
}
}
public class ThreadMain
{
public static void main(String args[])
{
ThreadA t1 =new ThreadA();
ThreadB t2 =new ThreadB();
t1.start();
try
{
 t1.join();
}
catch(Exception e)
{
System.out.println(e);
}
 t2.start();
}
}
