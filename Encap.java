class Human
{
  private int age;
  private String name;
  //Constructor
  public Human()  //Default Constructor
  {
    age = 12;
    name = "Vaishu";
  }
  public Human(int a, String n) //Parameterised Constructor
  {
    age = a;
    name = n;
  }

  public int getAge()
  {
    return age;
  }
  public void setAge()
  {
    this.age = age;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String n)
  {
    this.name = name;
  }
}

public class Encap
{
  public static void main(String args[])
  {
      Human obj = new Human();
      Human obj1 = new Human(19,"Shivanya");
      // obj.setAge(22);
      // obj.setName("Vaishu");s
      System.out.println(obj.getName()+" : "+obj.getAge());
      System.out.println(obj1.getName()+" : "+obj1.getAge());
  }
}