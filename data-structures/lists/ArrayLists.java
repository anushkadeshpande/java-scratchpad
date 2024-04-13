import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<String> arrList = new ArrayList<>();

    arrList.add("A");
    arrList.add("B");
    arrList.add("C");
    arrList.add("D");

    System.out.println(arrList.indexOf("C"));

    arrList.remove("B");

    System.out.println(arrList.indexOf("C"));

    arrList.contains("B");

    for(int i=0; i<10; i++)
      arrList.add("Hi");

    System.out.println(arrList);

    arrList.removeIf(element -> element.equals("Hi"));

    System.out.println(arrList);

    // even if elements are added and removed, it still reserves the space
    arrList.trimToSize();


    /*
     * 
     * Facts:
     * every time that the underlying array runs out of space, the array is increased by 50%.
     */
  }  
}
