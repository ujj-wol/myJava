//import java.util.Arrays;

public class WordGame {
  public static void main (String[] args) {
    char[] tenPoints = {'j', 'q', 'x', 'z'};
    char[] fivePoints = {'k', 'v'};
    char[] onePoint = new char[52];

    int i = 0;
    for (char ch = 'a', cH = 'A'; ch <= 'z'; ch++, cH++) {
      onePoint[i] = ch;
      onePoint[26+i] = cH;
      i++;
    }

    /*System.out.println(Arrays.toString(tenPoints));
    System.out.println(Arrays.toString(fivePoints));
    System.out.println(Arrays.toString(onePoint));*/

    char[] testArray = new char[] {'a', 'r', 't', 'f', 'z'};
    System.out.println(playGame(testArray, tenPoints, fivePoints, onePoint));

    testArray = new char[] {'A'};
    System.out.println(playGame(testArray, tenPoints, fivePoints, onePoint));

    testArray = new char[] {'#'};
    System.out.println(playGame(testArray, tenPoints, fivePoints, onePoint));

    testArray = new char[] {'A', 'k', 'j'};
    System.out.println(playGame(testArray, tenPoints, fivePoints, onePoint));

  }

  public static int playGame (char[] a, char[] ten, char[] five, char[] one) {
    int sum = 0;
    boolean testOtherArray = true;
    for (int i = 0; i < a.length; i++) {
      if (testOtherArray) {
        for (char ch10 : ten) {
          if (a[i] == ch10) {
            sum += 10;
            testOtherArray = false;
            break;
          }
        }
      }

      if (testOtherArray) {
        for (char ch5 : five) {
          if (a[i] == ch5) {
            sum += 5;
            testOtherArray = false;
            break;
          }
        }
      }

      if (testOtherArray) {
        for (char ch1 : one) {
          if (a[i] == ch1) {
            sum++;
            testOtherArray = false;
            break;
          }
        }
      }

      if (testOtherArray) {
        sum += 0;
      }
    testOtherArray = true;
    }

    return sum;
  }
}
