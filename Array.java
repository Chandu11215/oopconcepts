import java.util.Scanner;
public class Array
{
public static void main(String[] args)
{
int [] a=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("enter the ten integers of array");

for(int i=0;i<=10;i++)
{
 a[i] = s.nextInt();
}

System.out.println("you have Entered");

for(int i=0;i<10;i++)
{
System.out.println(a[i]);
}
}
}

