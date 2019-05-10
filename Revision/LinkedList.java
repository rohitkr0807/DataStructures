package Revision;

public class LinkedList {
    private class Node{
        Node next;
        int data;
        public Node(int data,Node next)
        {
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        return this.size()==0;
    }

    public void addFirst(int data)
    {
        Node newHead= new Node(data,null);
        if(this.isEmpty())
        {
            this.tail=newHead;
        }
        this.head=newHead;
        size++;
    }
    public void addLast(int item)
    {
        if(this.isEmpty())
        {
            addFirst(item);
        }
        Node newTail= new Node(item,null);
        this.tail.next=newTail;
        this.tail=newTail;
        this.size++;
    }
}
