import java.util.LinkedList;;

public class LinkListOperation {
    private int size;    

    LinkListOperation()
    {
        this.size =0; // Initializing size with zero
    }

    static class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
        Node head; // Initailizing head variable

        //Operations on LinkedList

        // 1-> Add at first position

        public void addFirst(String data)
        {
            Node newNode = new Node(data);
            size++;
            if(head == null)
            {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // 2-> Add at last position
        public void addLast(String data)
        {
            Node newNode = new Node(data);
            size++;
            if(head == null)
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
        }

        // Printing List
        public void printList()
        {
            if(head==null)
            {
                System.out.println("List is empty");
                return;
            }
            Node currNode = head;
            while(currNode != null)
            {
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }

        // 3-> Delete at first position
        public void deleteFirst()
        {
            if(head == null)
            {
                System.out.println("Already empty");
                return;
            }
            size--;

            head = head.next;
            System.out.print("deleted succesfully -> ");
        }

        // 4-> Delete from Last Node
        public void deleteLast()
        {
            if(head == null)
            {
                System.out.println("Already Empty");
                return;
            }
            size--;

            if(head.next == null)
            {
                head = null;
                return;
            }

            Node secondLast = head;
            Node last = head.next;

            while(last.next!=null)
            {
                last = last.next;
                secondLast = secondLast.next;
            }

            secondLast.next = null;

        }

        public int getSize()
        {
            return size;
        }

        // delete at specific postion
        public String deleteAT(int index)
        {
            Node prevNode = get(index-1);
            String value = prevNode.next.data;

            prevNode.next = prevNode.next.next;

            
            
            return value;
        }

        //get value/node  from the given index
        public Node get(int index){
            Node tempNode = head;

            for(int i=0;i<index;i++)
            {
                tempNode = tempNode.next;
            }
            return tempNode;
        }

        // 
        
        //another way
        public void reverse()
        {
            Node prev = null;
            Node curr = head;

            while(curr!=null)
            {
                Node next = curr.next;
                curr.next = prev;

                //updates nodes
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        public Node createCycleLinkedList() {
            // Step 1: Create nodes
            Node node1 = new Node("Hello");
            Node node2 = new Node("this");
            Node node3 = new Node("is");
            Node node4 = new Node("a");
            Node node5 = new Node("cycle");
    
            // Step 2: Link nodes together
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
    
            // Step 3: Create a cycle by pointing the last node to node3
            node5.next = node3;  // This creates a cycle from node 5 back to node 3
    
            // Return the head of the list
            head = node1;
            return head;
        }

        public boolean isCycle()
        {
            if (head == null || head.next == null) {
                System.out.println("Empty");
            }
            Node slow=head, fast=head;

            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast)
                {
                    return true;
                }
            }
            return false;
        }

        public void removeCycle()
        {
            if (head == null || head.next == null) {
                System.out.println("Empty");
            }
            Node slow=head, fast=head;

            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast)
                {
                    slow.next=null;
                    break;
                    // return true;
                }
            }
            System.out.println("Cycle removed");
            
        }

    public static void main(String[] args) {
        LinkListOperation ll = new LinkListOperation();
        // ll.addFirst("Malik");
        // ll.addLast("Javed");
        // ll.addLast("MCA");
        // ll.addLast("RK");

        // ll.deleteAT(2);
        // ll.deleteAT();
        // System.out.println(ll.get(2));
        // System.out.println(ll.getSize());
        // ll.deleteFirst();
        // ll.deleteLast();
        // ll.printList();
        
        // ll.reverse();
        ll.createCycleLinkedList();
        
        if(ll.isCycle())
        {
            System.out.println("Cycle present");
        }
        else{
            System.out.println("cycle not present");
        }

        ll.removeCycle();
        
        
        ll.printList();

        // ll.printList();

    }
}
