// LinkedList
// import java.util.*;

// public class que14 {
//   public static void main(String[] args) {
//     LinkedList<Integer> ll = new LinkedList<>();
//     ll.add(10);
//     ll.add(20);
//     ll.add(30);
//     ll.add(40);
//     ll.addFirst(1);
//     ll.addLast(50);
//     ll.remove(2);

//     Iterator<Integer> it = ll.iterator();
//     while (it.hasNext()) {
//       System.out.println(it.next());
//     }
//   }
// }


// HashMap
import java.util.*;

class que14 {
  public static void main(String[] args) {
    Map<Integer, String> hm = new HashMap<>();
    hm.put(1, "A");
    hm.put(2, "B");
    hm.put(3, "C");
    hm.put(4, "D");
    System.out.println(hm.get(2));

    Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<Integer, String> e = it.next();
      System.out.println(e.getKey() + " : " + e.getValue());
    }
  }
}
