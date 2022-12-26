import java.util.Scanner;

public class Average {
  public static int calculateAverage(int a, int b, int c) {
    int Average = (a + b + c) / 3;
    return Average;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int Average = calculateAverage(a, b, c);

    System.out.println(Average);

  }

}
