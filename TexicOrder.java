public class TexicOrder {

  public static void main (String[] args) {
    char[] a = {'a', 'b', 'c'};
    char[] b = {'a', 'd', 'c'};
    System.out.println(texicOrder(a, b));

    a = new char[]{'a', 'b', 'c'};
    b = null;
    System.out.println(texicOrder(a, b));

    a = new char[]{'a', 'b', 'c'};
    b = new char[]{'a', 'b', 'c'};
    System.out.println(texicOrder(a, b));

    a = new char[]{'a', 'b', 'c', 'f'};
    b = new char[]{'a', 'b', 'c'};
    System.out.println(texicOrder(a, b));

    a = new char[]{'a', 'b', 'f'};
    b = new char[]{'a', 'b', 'd', 'c'};
    System.out.println(texicOrder(a, b));

    a = new char[]{'a', 'b', 'f'};
    b = new char[]{'a', 'b', 'g', 'c'};
    System.out.println(texicOrder(a, b));

    a = new char[]{'a', 'b', 'f'};
    b = new char[]{'a', 'g'};
    System.out.println(texicOrder(a, b));
  }

  static int texicOrder (char[] a, char[] b) {
    if (a == null || b == null)
      return 3;
    for (int i = 0; i < a.length && i < b.length; i++) {
      if (a[i] > b[i])
        return 1;
      else if (a[i] < b[i])
        return 2;
    }
    if (a.length >= b.length)
      return 1;
    else
      return 2;
  }
}
