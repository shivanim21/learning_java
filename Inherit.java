public class Inherit
{
  public static void main(String a[])
  {
    Calc obj = new Calc();
    int r1 = obj.add(4,5);
    int r2 = obj.sub(9,5);  

    System.out.println(r1 + " " + r2);
  }
}