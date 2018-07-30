public class IntegerEquivalent {
  public static void main (String[] args) {
    System.out.println(integerEquivalent(new char[] {'1', '2', '3', '1'}));
    System.out.println(integerEquivalent(new char[] {'1','3','9'}));
    System.out.println(integerEquivalent(new char[] {'0','3', '1'}));
    System.out.println(integerEquivalent(new char[] {'1', '+', '5'}));
    System.out.println(integerEquivalent(new char[] {'1', '5', '+'}));
    System.out.println(integerEquivalent(new char[] {'*'}));
    System.out.println(integerEquivalent(new char[] {}));
  }

  public static int integerEquivalent (char[] a) {
    if (a == null || a.length == 0)
      return -1;
    int number = 0, digit = 0;
    for (int i = 0; i < a.length; i++) {
      digit = Character.getNumericValue(a[i]);
      //digit = Integer.parseInt(String.valueOf(a[i]));
      if (digit == -1) return -1;
      else
        number = number * 10 + digit;
    }
    return number;
  }
}
