import java.util.Scanner;

public class greateroftwo {
  public static int getGreater(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(getGreater(a, b));

  }
}
