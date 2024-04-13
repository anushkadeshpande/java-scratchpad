import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IterationExample {
  public static void main(String[] args) {
    // Based on Iterator design pattern
    // iterator is a way to walk through a collection

    Vector<String> strVector1 = new Vector<>(Arrays.asList("apple", "chocolate", "ball"));
    Enumeration<String> en = strVector1.elements();

    while(en.hasMoreElements()) {
      String item = en.nextElement();

      if(item.contains("e"))
        strVector1.remove(item);

      // System.out.println(en.nextElement());
    }

    System.out.println(strVector1);     // --> [chocolate, ball]

    // ! Note: when strVector1 is used, and element having 'e' is removed, it removes only the 1st element
    // this is because when 1st element is removed, the 2nd and 3rd elements shift one place

    // but if we use this array instead: "apple", "ball", "chocolate"
    // it removes 1st and 3rd elements correctly
    Vector<String> strVector2 = new Vector<>(Arrays.asList("apple", "ball", "chocolate"));
    Enumeration<String> en2 = strVector2.elements();

    while(en2.hasMoreElements()) {
      String item = en2.nextElement();

      if(item.contains("e"))
        strVector2.remove(item);

      // System.out.println(en.nextElement());
    }

    System.out.println(strVector2);     // --> [ball]


    /* 
     * 
     * 
     * 
     * Now, this problem was solved by ArrayList by the Iterator
     * It throws java.util.ConcurrentModificationException
     * FailFast iteration
     */

     ArrayList<String> arrList = new ArrayList<>(Arrays.asList("apple", "chocolate", "ball"));
     Iterator<String> iter = arrList.iterator();
 
     while(iter.hasNext()) {
       String item = iter.next();
 
       if(item.contains("e"))
         arrList.remove(item);
 
       // System.out.println(en.nextElement());
     }
 
     System.out.println(arrList);    // throws java.util.ConcurrentModificationException
  }  
}
