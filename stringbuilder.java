public class stringbuilder {
  public static void main(String args[]) {
    StringBuilder sb = new StringBuilder("Jubi");
    System.out.println(sb);

    // set character
    sb.insert(3, 'u');
    System.out.println(sb);

    // delete the extra 'n'
    sb.delete(1, 3);
    System.out.println(sb);

    // append function

  }
}
