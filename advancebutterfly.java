public class advancebutterfly {
  public static void main(String args[]) {
    int n = 5;
    // UPPER PART
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // SPACES
      int spaces = 2 * (n - i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      // LOWER PART
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();

    }
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // SPACES
      int spaces = 2 * (n - i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      // LOWER PART
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();

    }

  }

}
