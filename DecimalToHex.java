import java.util.Scanner;

public class DecimalToHex {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int decimalNum = input.nextInt();
    System.out.println("The HEX equivalent of the decimal is " + decimalToHex(decimalNum));
  }

  static String decimalToHex(int number) {
  //  int hexDigit = 0;
    String hex = "";
    while(number >= 1) {
/*
      hexDigit = number % 16;
      number /= 16;
      switch(hexDigit) {
        case 10: hex = "A" + hex;
          break;
        case 11: hex = "B" + hex;
          break;
        case 12: hex = "C" + hex;
          break;
        case 13: hex = "D" + hex;
          break;
        case 14: hex = "E" + hex;
          break;
        case 15: hex = "F" + hex;
          break;
        default: hex = hexDigit + hex;
      }
*/
      int hexValue = number % 16;
      // Convert a decimal value to a hex digit
      char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
      (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');

      hex = hexDigit + hex;
      number /= 16;

    }
    return hex;
  }
}
