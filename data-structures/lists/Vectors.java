import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Vectors {
  /* 
   * Not used anymore
   * use Collections.synchronizedList() instead 
   * 
   * Vectors are thread safe
   * 
   * Disadvantages:
   * - It is slow due to synchronization
   * - Serialization of a vector is expensive
   */

   public static void main(String[] args) {
    Vector<String> names = new Vector<>(Arrays.asList("A", "B", "C"));

    // new way to create thread safe list
    List<String> nameSafe = Collections.synchronizedList(new ArrayList<>(Arrays.asList("A", "B", "C")));
   }
}
