import java.util.Scanner;

public class userinputarray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.println(numbers[i]);
    }

  }

}
