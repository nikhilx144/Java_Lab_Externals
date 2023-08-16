// import java.util.*;

// class que2 {
//   public static void main(String[] args) {
//     List<Integer> al = new ArrayList<>();
//     al.add(10);
//     al.add(20);
//     al.add(30);
//     al.add(40);
//     al.remove(2);
//     al.replaceAll(e -> e/10);
//     System.out.println(al.get(1));
//     Iterator<Integer> it = al.iterator();
//     while (it.hasNext())
//       System.out.println(it.next());
//   }
// }

import java.util.*;

class que2 {
  public static void main(String[] args) {
    Map<Integer, String> tm = new TreeMap<>();
    tm.put(1, "A");
    tm.put(2, "B");
    tm.put(3, "C");
    tm.put(4, "D");
    tm.put(5, "E");
    tm.remove(5);
    System.out.println(tm.get(4));
    Iterator<Map.Entry<Integer, String>> it = tm.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<Integer, String> e = it.next();
      System.out.println(e.getKey() + " : " + e.getValue());
    }
  }
}

