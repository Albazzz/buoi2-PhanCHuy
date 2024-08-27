package linklist;

public class Node {
    private  int a ;
    private Node next ;

    public Node(int a, Node next) {
        this.a = a;
        this.next = next;
    }

    public Node(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" +
                "gia tri la " + a +
                ", next=" + next +
                '}';
    }
}
