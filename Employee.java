// FPP lesson 3 example 2 Practice

public class Employee {
  private String name;
  private int age;

  public Employee (String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Employee (String name) {
    this.name = name;
  }

  public String getName () {
    return this.name;
  }

  public void setName (String aName) {
    this.name = aName;
  }

  public static void main (String[] args) {
    Employee a = new Employee ("Ram", 25);
    Employee b = new Employee ("Gita", 23);

    System.out.println("Employee 1: " + a.getName());
    System.out.println("Employee 2: " + b.getName());

    b.setName("Sita");
    swap (a, b);
    System.out.println("Employee 1: " + a.getName());
    System.out.println("Employee 2: " + b.getName());

    swapCorrectly (a, b);
    System.out.println("Employee 1: " + a.getName());
    System.out.println("Employee 2: " + b.getName());
  }

  public static void swap (Employee x, Employee y) {
    Employee temp = x;
    x = y;
    y = temp;
  }

  public static void swapCorrectly (Employee x, Employee y) {
    String s = x.getName();
    x.setName(y.getName());
    y.setName(s);
  }
}
