// Abstract Class
// abstract class A {
//   abstract double area();
// }

// class Rectangle extends A {
//   int l = 10;
//   int b = 20;
//   double area() {
//     return l*b;
//   }
// }

// class Square extends A {
//   int s = 10;
//   double area() {
//     return s*s;
//   }
// }

// public class que5 {
//   public static void main(String[] args) {
//     Rectangle r1 = new Rectangle();
//     Square s1 = new Square();
//     System.out.println("Area of rectangle = " + r1.area());
//     System.out.println("Area of square = " + s1.area());
//   }
// }

// Interface

interface A {
  void a();
}

interface B {
  void b();
}

interface C extends A, B {
  void c();
}

class C1 implements C {
  public void a() {
    System.out.println("Method A");
  }
  public void b() {
    System.out.println("Method B");
  }
  public void c() {
    System.out.println("Method C");
  }
}

class que5 {
  public static void main(String[] args) {
    C1 c1 = new C1();
    c1.a();
    c1.b();
    c1.c();
  }
}