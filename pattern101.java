public class pattern101 {
  public static void main(String args[]) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        int sum = i + j;// FOR ODD AND EVEN CHECK
        if (sum % 2 == 0) {
          System.out.print("1");// EVEN

        } else {
          System.out.print("0");// ODD
        }
        System.out.println();
      }
    }

  }

}
