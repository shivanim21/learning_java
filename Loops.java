public class Loops
{
  public static void main(String args[])
  {
    //While loop
    /*int i =1;
    while (i<=4)
    {
      System.out.println("Hi "+i);
      int j =1;
      while(j<=3){
        System.out.println("Hello "+j);
        j++;
      }
      i++;
    }
    System.out.println("Bye " + i);*/

    //Do while
    /*int i = 5;

    do
    {
      System.out.println("Hi "+i);

      i++;
    }while(i<=4);*/

    //For 

    for(int i = 1; i<=7; i++){
      System.out.println("DAY "+ i);

      for(int j =1;j<=9;j++){
        System.out.println("   " + (j+8) + " - " + (j+9));
      }
    }

  }
}