import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word to test for palindrome: ");
    String testWord = input.nextLine();
    //(checkPalindrome(testWord) == 1) ? System.out.println("The word is palindrome!!") :
    //System.out.println("The word is not a palindrome!!");
    if(checkPalindrome(testWord) == 1)
      System.out.println("The word is palindrome!!");
    else
      System.out.println("Not a palindrome!!");
  }

  static int checkPalindrome(String s) {
    for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
      if(s.charAt(i) != s.charAt(j))
        return 0;
    }
    return 1;
  }
}
