import java.util.Arrays;

public class Anagrams {
  public static void main (String[] args) {
    System.out.println(areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 't', 's'}));
    System.out.println(areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 'd', 's'}));
    System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 't'}));
    System.out.println(areAnagrams(new char[] {'b', 'o', 'g'}, new char[] {'b', 'o', 'o'}));
    System.out.println(areAnagrams(new char[] {}, new char[] {}));
    System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 'g'}));
    System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i'}));
    System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'t', 'i', 'g'}));
    System.out.println(areAnagrams(new char[] {'s', 'i', 'x', 'a'}, new char[] {'i', 'x', 's', 'a'}));

  }

  static int areAnagrams (char[] a1, char[] a2) {

    //System.out.println(Arrays.toString(a1));
    //System.out.println(Arrays.toString(a2));

    if (a1.length != a2.length) return 0;

    int len = a1.length;
    char[] a1Copy = new char[len];
    char[] a2Copy = new char[len];

    int i;
    for (i = 0; i < len; i++) {
      a1Copy[i] = a1[i];
      a2Copy[i] = a2[i];
    }

    for (i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        if (a1Copy[i] == a2Copy[j]) {
          a1Copy[i] = ' ';
          a2Copy[j] = ' ';
          break;
        }
      }
    }

    for (int k = 0; k < len; k++) {
      if (a1Copy[k] != ' ' || a2Copy[k] != ' ')
        return 0;
    }
    return 1;
    //if (Arrays.equals(a1Copy, a2Copy))
    //  return 1;
    //else return 0;
  }
}
