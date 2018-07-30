import java.util.Arrays;

public class PrintAsterisk {
  public static void main (String[] args) {
    printAsterisk(new char[] {'a', 'b', 'a', 'b', 'c', 'd', 'a', 'c', 'a', 'b', 'd', 'f'});
    System.out.println("");
    printAsterisk(new char[] {'b', 'b', 'a', 'b', 'a', 'd', 'a', 'b', 'a', 'b', 'a', 'a'});
  }

  static char[] printAsterisk (char[] a) {
    char[] newArray = new char[a.length];
    int counter = 0;
    boolean duplicate = false;
    int[] duplicateCount = new int[newArray.length];

    for (int j = 0; j < a.length; j++) {
      duplicate = false;
      int i = 0;
      for (i = 0; i < counter; i++) {
        if (a[j] == newArray[i]) {
          duplicate = true;
          break;
        }
      }
      if (!duplicate) {
        newArray[counter] = a[j];
        duplicateCount[counter]++;
        counter++;
      } else
          duplicateCount[i]++;
    }
    char[] finalArray = new char[counter];
    for (int i = 0; i < counter; i++) {
      finalArray[i] = newArray[i];
      System.out.print(finalArray[i] + " -- ");
      for (int j = 0; j < duplicateCount[i]; j++)
        System.out.print("*");
      System.out.println("");
    }
    return finalArray;
  }
}
