import java.util.Scanner;

public class greaterlesser {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b= sc.nextInt();
    if (a==b){
      System.out.println("Equal");
      //else function
    //}else{
      //else if function
    }else if(a>b){
        System.out.println("Greater");
      }else{
         System.out.println("Lesser");
      }

  }
}
