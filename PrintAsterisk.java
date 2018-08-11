import java.util.Arrays;

public class PrintAsterisk {
  public static void main (String[] args) {
    printAsterisk1(new char[] {'a', 'b', 'a', 'b', 'c', 'd', 'a', 'c', 'a', 'b', 'd', 'f'});
    System.out.println("");
    printAsterisk1(new char[] {'b', 'b', 'a', 'b', 'a', 'd', 'a', 'b', 'a', 'b', 'a', 'a'});
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


  static char[] printAsterisk1 (char[] a) {
    char[] uniqueArray = new char[a.length];
    int[] uniqueArrayCount = new int[a.length];
    int counter = 0;
    for(int i = 0; i < a.length; i++) {
      boolean checkDuplicates = true;
      int index = 0;
      while(index < counter) {
        if(a[i] == uniqueArray[index]) {
          checkDuplicates = false;
          break;
        }
        index++;
      }
      if(checkDuplicates) {
        for(int j = i + 1; j < a.length; j++) {
          if(a[i] == a[j])
            uniqueArrayCount[counter]++;
        }
        uniqueArray[counter] = a[i];
        counter++;
      }
    }
    char[] finalArray = new char[counter];
    for (int i = 0; i < counter; i++) {
      finalArray[i] = uniqueArray[i];
      System.out.print(finalArray[i] + " -- ");
      for (int j = 0; j <= uniqueArrayCount[i]; j++)
        System.out.print("*");
      System.out.println("");
    }
    return finalArray;
  }
}
