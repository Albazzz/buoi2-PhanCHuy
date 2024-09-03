package linklist;

import java.util.ArrayList;

public class Linkedlist {
    private Node head;

    public void addfnode(int s) {
        Node newnode = new Node();
        newnode.setA(s);
        newnode.setNext(head);
        head = newnode;
    }

    public void addlnode(int a) {
        Node newnode = new Node();
        newnode.setA(a);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();

        }
        temp.setNext(newnode);

    }

    public void addrandom(int a, int index) {
        Node newnode = new Node(a);
        if (index == 0) {
            addfnode(a);
        } else {

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node nextNode = temp.getNext();
            temp.setNext(newnode);
            newnode.setNext(nextNode);
        }
    }

    public int lenghtlinkedlist() {
        int count = 1;
        Node temp = head;
        while (temp.getNext() != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void deleterandom(int index, Linkedlist a) {
        if (head == null)
        {
            System.out.println("linkedlist rong ");
            return;
        }
        if (a.lenghtlinkedlist() <= index || index < 0) {
            System.out.println("index da chon khong ton tai ");
            return;
        }
        else {
            if (index == a.lenghtlinkedlist() - 1) {
                a.deletelast(a);
                return;
            }
            if (index == 0) {
                a.deletefirst();
                return;
            }
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node deletenode = temp.getNext();
            temp.setNext(deletenode.getNext());
        }
    }

    public void deletelast(Linkedlist ll) {
        Node temp = head;
        if (ll.lenghtlinkedlist() == 1) {
            ll.deletefirst();
        }
        for (int i = 0; i < ll.lenghtlinkedlist() - 2; i++) {
            temp = temp.getNext();
        }
        temp.setNext(null);
    }

    public void displaylinkedlist() {
        Node temp = head;
        int i = 0;
        do {
            i++;
            if (temp.getNext() != null) {
                System.out.print("node thu " + i + " gia tri la " + temp.getA() + "-->");
            } else {
                System.out.println("node thu " + i + " gia tri la " + temp.getA());
            }
            temp = temp.getNext();
        }
        while (temp != null);

    }

    public void searchlinkedlist(int data) {
        Node temp = head;
        int count = 0;
        do {
            if (temp.getA() == data) {
                System.out.println("du lieu can tim dang o vi tri thu " + count);
                return;
            }
            temp = temp.getNext();
            count++;
        }
        while (temp != null);
        System.out.println("khong tim thay ");
    }

    public boolean search(int a) {
        if (head == null) {
            return false;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.getA() == a)
                return true;
        }
        return false;
    }

    public void deletefirst() {
        head = head.getNext();
    }
public void deletebycount(int index, Linkedlist a){
   int count =0;

    if (head == null)
    {
        System.out.println("linkedlist rong ");
        return;
    }
    if (a.lenghtlinkedlist() <= index || index < 0) {
        System.out.println("index da chon khong ton tai ");
        return;
    }
    else
    {
        if (index == a.lenghtlinkedlist() - 1) {
            a.deletelast(a);
            return;
        }
        if (index == 0) {
            a.deletefirst();
            return;
        }
        Node temp = head;
       while (count!=index-1){
           temp = temp.getNext();
           count++;

       }
        Node deletenode = temp.getNext();
        temp.setNext(deletenode.getNext());
    }
}
public void sortlinkedlist()
{
    Node temp = head;
    ArrayList<Integer> a = new ArrayList<>();
    int leght = lenghtlinkedlist();
    for (int i = 0 ; i<leght;i++)
    {
        a.add(temp.getA());
        temp = temp.getNext();
    }
a.sort(Integer::compareTo);
  temp =head;
    for (int i = 0 ;i<leght;i++)
  {
      temp.setA(a.get(i));
     temp= temp.getNext();
  }
}

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addfnode(2);
        ll.addlnode(1);
        ll.addlnode(4);
        ll.addlnode(5);
        ll.addlnode(7);
        ll.addlnode(6);
        ll.addlnode(9);
//        System.out.println("so luong node la " + ll.lenghtlinkedlist());
//        ll.displaylinkedlist();
//        ll.deletebycount(3,ll);
//        ll.displaylinkedlist();
//        ll.searchlinkedlist(5);
        ll.sortlinkedlist();
        ll.displaylinkedlist();
    }

}
