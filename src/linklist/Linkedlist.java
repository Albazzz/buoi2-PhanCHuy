package linklist;

import java.awt.*;

public class Linkedlist {
private Node head ;
public void addfnode (int s){
    Node newnode = new Node();
    newnode.setA(s);
newnode.setNext(head);
head = newnode;
}
public void addlnode(int a )
{
    Node newnode = new Node();
    newnode.setA(a);
if (head == null){
    head = newnode;
    return;
}
Node temp = head;
while (temp.getNext() != null)
{
    temp = temp.getNext();

}
temp.setNext(newnode);

}
public void addrandom (int a ,int index)
{
Node newnode = new Node(a);
    if ( index == 0 ){
        addfnode(a);
    }
    else
    {

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node nextNode = temp.getNext();
            temp.setNext(newnode);
            newnode.setNext(nextNode);
        }
    }
public  int lenghtlinkedlist ()
{
    int count = 1;
    Node temp = head;
    while (temp.getNext() != null)
    {
        count++;
        temp = temp.getNext();
    }
    return count;
}
public void displaylinkedlist ()
{
    Node temp = head;
    int i = 0 ;
    do {
        i++;
        if(temp.getNext() != null)
        {
            System.out.print("node thu "+i + " gia tri la "+temp.getA()+"-->");
        }
     else {
            System.out.println("node thu "+i + " gia tri la "+temp.getA());
        }
temp = temp.getNext();
    }
    while (temp!= null);

}
public void deletefirst ()
{
head = head.getNext();
}


    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addfnode(2);
        ll.addfnode(4);
        ll.addlnode(1);
        System.out.println("so luong node la "+ll.lenghtlinkedlist());
        ll.displaylinkedlist();
        ll.deletefirst();
        ll.displaylinkedlist();
        System.out.println("so luong node la "+ll.lenghtlinkedlist());
    }

}
