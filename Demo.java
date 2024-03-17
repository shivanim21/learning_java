/*public class Demo 
{
  public static void main(String args[]) {
    int x = 6; //Assignment
    int y = 5;
    int a = 6;
    int b = 9;

    //boolean result =x < y; //Relational
    boolean result = x>y && a<b; //Logical 
    System.out.println(result);

    //Arrays
    int nums[] = {3,7,8,9};
    nums[1]=6;

    System.out.println(nums[1]); 

    int nums[] = new int[4];
    nums[0] = 2;
    nums[1] = 4;
    nums[2] = 6;
    nums[3] = 8;

    for(int i=0;i<4;i++){
      System.out.println(nums[i]);
    }

    //Enhanced for loop or for each
    for(int n : nums )
    {
      System.out.println(n);
    }

    //Multidimensional Array
    int nums[][] = new int[3][4];
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<4;j++)
      {
        nums[i][j] = (int)(Math.random() * 10);
      }
    }

    for(int i=0;i<3;i++)
    {
      for(int j=0;j<4;j++)
      {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }
  }
}*/

//Anonymous Object

class A
{
  public A()
  {
    System.out.println("Object Created");
  }
  public void show(){
    System.out.println("in A show");
  }
}

public class Demo
{
  public static void main(String a[])
  {
    new A().show(); //Anonymous object - Object has no name
  }
}