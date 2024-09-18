public class DoublyLink {
    private class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head;

    // DoublyLink()
    // {
    //     head.prev=null;
    // }
    
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;

        while(currNode.next!=null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.prev = currNode;
        newNode.next =null;

    }

    public void printList()
    {
        Node currNode = head;
        if(currNode==null)
        {
            System.out.println("List is Empty");
        }
        while(currNode!=null)
        {
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public void printReverse()
    {
        Node currNode = head;
        if(currNode==null)
        {
            System.out.println("List is Empty");
        }

        while(currNode.next!=null)
        {
            currNode =currNode.next;
        }
        Node tail = currNode;
        Node rev=tail;

        while(rev!=null)
        {
            System.out.print(rev.data + " -> ");
            rev = rev.prev;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLink dl = new DoublyLink();
        dl.addLast(10);
        dl.addLast(20);
        dl.addLast(30);
        dl.addLast(40);
        dl.printList();
        dl.printReverse();
    }
}
