public class matchPattern {

  public static void main(String[] args) {

      int a = matchPattern(new int[] {1, 1, 1, 2, 2, 1, 1, 3}, 8, new int[] {1, 2, 1, 3}, 4);
      System.out.println(a);

      a = matchPattern(new int[] {1, 1, 1, 1}, 4, new int[] {1}, 1);
      System.out.println(a);

      a = matchPattern(new int[] {1}, 1, new int[] {1}, 1);
      System.out.println(a);

      a = matchPattern(new int[] {1, 1, 2, 2, 2, 2}, 6, new int[] {1, 2}, 2);
      System.out.println(a);

      a = matchPattern(new int[] {1, 2, 3}, 3, new int[] {1, 2}, 2);
      System.out.println(a);

      a = matchPattern(new int[] {1, 2}, 2, new int[] {1, 2, 3}, 3);
      System.out.println(a);

      a = matchPattern(new int[] {1, 1, 2, 2,2,2, 3}, 7, new int[] {1, 3}, 2);
      System.out.println(a);

      a = matchPattern(new int[] {1, 1,1,1}, 4, new int[] {1, 2}, 2);
      System.out.println(a);

      a = matchPattern(new int[] {1, 1,1,1, 2,2, 3, 3}, 8, new int[] {1, 2}, 2);
      System.out.println(a);

      a = matchPattern(new int[] {1, 1,10,4,4,3}, 6, new int[] {1, 4, 3}, 3);
      System.out.println(a);

      a = matchPattern(new int[] {1, 1,1,1,2,3,4,5,6,7}, 10, new int[] {1, 2, 3, 4, 5, 6, 7}, 7);
      System.out.println(a);

      a = matchPattern(new int[] {1, 1,1,1,2,3,4,3,5,6,7}, 11, new int[] {1, 2, 3, 4,3, 5, 6,6, 7}, 9);
      System.out.println(a);

      a = matchPattern(new int[] {1, 1,1,1,2,3,4,3,5,6,7}, 11, new int[] {1, 2, 3, 4,3, 5, 6, 7}, 8);
      System.out.println(a);
  }

  static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
  // len is the number of elements in the array a, patternLen is the number of elements in the pattern.
  int i=0; // index into a
  int k=0; // index into pattern
  int matches = 0;  // how many times current pattern character has been matched so far
  for (i=0; i<len; i++)  {
    if (a[i] == pattern[k])
      matches++;   // current pattern character was matched
    else if (matches == 0 || k == patternLen-1)
      return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
    else { // advance to next pattern character
       //!!You write this code!!
       if (a[i] != pattern[k+1])
        return 0;
       k++;
    } // end of else
  } // end of for

  // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
  if (i==len && k==patternLen-1) return 1; else return 0;
  }
}
