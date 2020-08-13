import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Username
{
 public static void main(String[] srgs)
{
  String username;
  Scanner s=new Scanner(System.in);
  System.out.println("enter the username");
     username=s.next();
  Pattern p=Pattern.compile("[a-zA-Z0-9]{8,20}");
  Matcher m=p.matcher(username);
   if(m.matches())
{
  System.out.println("data is valid");
}
else
{
System.out.println("data is invalid");
}
}
}


