class Vechile
{
  String brand;
  float price;

  void horn()
{
  System.out.println("horn horn");
}
}
class TwoWheeler extends Vechile
{
  boolean choke;
}
  void instruction()
{
  System.out.println("be careful while driving");
}
class FourWheeler extends Vechile
{
  boolean AC;
}
  void accident()
{
  System.out.println("accident should be avoided");
}
public class Inheritence
{
 public static void main(String args[])
{
  TwoWheeler pulsar=new TwoWheeler();
   pulsar.horn();
   pulsar.instruction();
   pulsar.accident();
}
}


