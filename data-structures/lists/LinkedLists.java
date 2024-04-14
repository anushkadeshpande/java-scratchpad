import java.util.LinkedList;

public class LinkedLists {

  /* 
   * 
   * Custom implementation
   * 
   * 
   * 
   public final static class MyLinkedList<E> {
    private final class Node<E> {
      private Node<E> previous, next;
      private E element;

      public Node(E element) {
        this.element = element;
      }
    }

    private Node head;
    private Node tail;

    public void add(E element) {
      if (head == null) {
        head = tail = new Node<>(element);
      } else {
        Node<E> node = new Node<>(element);
        node.previous = tail;
        tail.next = node;
        tail = node;
      }
    }
  } */

  public static void main(String[] args) {
      LinkedList<Integer> queue = new LinkedList<>();   // almost never used
  }
}
