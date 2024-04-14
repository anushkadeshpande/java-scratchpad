import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CopyOnWriteArrayLists {

  /*
   * When we iterate over ArrayList and try to remove an element, it throws an
   * exception.
   * Check IterationExample.java
   * 
   * CopyOnWriteArrayList : Internally makes a copy whenever anything is modified
   * So, whenever any changes are done, internally another modified arrayList is
   * created
   * And the iterator points to the old unmodified arrayList, thus preventing any
   * exceptions
   * It has a Snapshot Iterator
   */

  public static void main(String[] args) {
    List<String> arrList = new CopyOnWriteArrayList<>(Arrays.asList("apple", "chocolate", "ball"));

    for (Iterator<String> it = arrList.iterator(); it.hasNext();) {
      String name = it.next();
      System.out.println(name);
      if (name.contains("e"))
        arrList.remove(name);
    }
    // arrList.forEach(name -> {
    //   System.out.println(name);
    //   if (name.contains("e"))
    //     arrList.remove(name);
    // });

    System.out.println(arrList);
  }

}
