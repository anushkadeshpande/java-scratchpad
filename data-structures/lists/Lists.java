import java.util.Arrays;
import java.util.List;

public class Lists {
  public static void main(String[] args) {
    
    // * This is a mutable list
    // Individual elements can be modified
    // but new elemets cannot be added to it

    List<String> strList = Arrays.asList("A", "B", "C");
    
    // * This is a purely immutable list
    // these immutable lists are stored in a very memory efficient way
    // List<String> strList = List.of("A", "B", "C");

    // System.out.println(strList.getClass());

    strList.set(2, "c");
    System.out.println(strList);

    strList.add("D");
    System.out.println(strList);

  }
}
