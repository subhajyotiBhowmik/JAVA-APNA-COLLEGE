public class Recursion1 {
  public static void printNumb(int n) {
    if (n == 0) { // if not given the base case then it will occur stackoverflow
      return;
    }
    System.out.println(n);
    printNumb(n - 1);

  }

  public static void main(String args[]) {
    int n = 5;
    printNumb(n);

  }
}