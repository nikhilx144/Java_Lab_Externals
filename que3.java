// Single Level Inheritance
// class A {
//   A() {
//     System.out.println("Inside A's constructor");
//   }
// }

// class B extends A{
//   B() {
//     System.out.println("Inside B's constructor");
//   }
// }

// public class que3 {
//   public static void main(String[] args) {
//     new B();
//   }
// }


// Multilevel Inheritance

class A {
  A() {
    System.out.println("Inside A's constructor");
  }
}

class B extends A{
  B() {
    System.out.println("Inside B's constructor");
  }
}

class C extends B{
  C() {
    System.out.println("Inside C's constructor");
  }
}

public class que3 {
  public static void main(String[] args) {
    new C();
  }
}