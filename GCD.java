import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers to get the GCD/ HCF of: ");
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + getGCD(n1, n2));
  }

  static int getGCD(int n1, int n2) {
    int divisor = n1 < n2 ? n1 : n2;
    for(; divisor > 1; divisor--) {
      if(n1 % divisor == 0 && n2 % divisor == 0)
        return divisor;
    }
    return 1;
  }

  static int getGCD_usingWhile(int n1, int n2) {
    int divisor = n1 < n2 ? n1 : n2;
    while(divisor > 1) {
      if(n1 % divisor == 0 && n2 % divisor == 0)
        return divisor;
      divisor--;
    }
    return 1;
  }
}
