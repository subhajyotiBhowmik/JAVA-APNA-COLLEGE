import java.util.*;

public class calculator {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int operator = sc.nextInt();

    /**
     * 1 -> +
     * 2 -> -
     * 3 -> *
     * 4 -> /
     * 5 -> %
     */

    switch (operator) {
      case 1:
        System.out.println(a + b);
        break;
      case 2:
        System.out.println(a - b);
        break;
      case 3:
        System.out.println(a * b);
        break;
      case 4:
        System.out.println(a / b);
        break;
      case 5:
        System.out.println(a % b);
        break;
      default:
        System.out.println("Invalid Operator");
    }
  }
}
