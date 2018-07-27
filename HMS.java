import java.util.Arrays;

public class HMS {
  public static void main (String[] args) {
    int[] a = computeHMS(3735);
    System.out.println (Arrays.toString(a));
    a = computeHMS(380);
    System.out.println (Arrays.toString(a));
    a = computeHMS(3650);
    System.out.println (Arrays.toString(a));
    a = computeHMS(55);
    System.out.println (Arrays.toString(a));
    a = computeHMS(0);
    System.out.println (Arrays.toString(a));
    a = computeHMS(3661);
    System.out.println (Arrays.toString(a));
  }

  static int[] computeHMS (int seconds) {
    int[] time = new int[3];
    time[0] = seconds / 3600;
    seconds %= 3600;
    time[1] = seconds / 60;
    seconds %= 60;
    time[2] = seconds;
    return time;
  }
}
