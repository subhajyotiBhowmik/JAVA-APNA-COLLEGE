import java.util.*;
public class oddeven{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x%2==0){
      System.out.println("Even");

    }else{
      System.out.println("Odd");
    }
  }
}