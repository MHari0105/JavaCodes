package workout;

import workout.LinkedList.Node;

class LinkedList {
  Node head;

  static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

}

public class LinkedListDemo {
  public static void main(String[] args) {

    LinkedList ll = new LinkedList();

    ll.head = new Node(1);
    Node second = new Node(2);
    ll.head.next = second;

    Node third = new Node(3);
    second.next = third;

    while (ll.head != null) {
      System.out.print(ll.head.value + " ");
      ll.head = ll.head.next;
    }
  }
}
