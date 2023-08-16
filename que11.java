// Method Overloading
class A {
  void m1() {
    System.out.println("This is method m1");
  }

  void m1(int n1, int n2) {
    System.out.println("This is method m1 with parameters " + n1 + " and " + n2);
  }
}

public class que11 {
  public static void main(String[] args) {
    A a1 = new A();
    a1.m1();
    a1.m1(10, 20);
  }
}
