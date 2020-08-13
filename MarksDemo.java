class Marks
{
 int EngMarks;
 int MathMarks;
 int PhyMarks;

   Marks(int EngMarks,int MathMarks,int PhyMarks)
{
   this.EngMarks = EngMarks;
   this.MathMarks = MathMarks;
   this.PhyMarks = PhyMarks;
}
}
class MarksDemo
{
 public static void main(String[] args)
{
 Marks m=new Marks(90,89,85);
     m.EngMarks();
     m.MathMarks();
     m.PhyMarks();
 
 System.out.prinln("enter the ma

 Marks m1=new Marks(78,87,97);
     m1.EngMarks();
     m1.MathMarks();
     m1.PhyMarks();

 System.out.println("enter the marks for second obj");
}


