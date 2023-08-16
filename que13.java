public class que13 {
  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 0;
    try {
      int n3 = n1 / n2;
      System.err.println(n3);
    } catch (ArithmeticException e) { e.printStackTrace(); }
  }
}
