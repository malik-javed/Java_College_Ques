public class LinkListOperation {
    private int size;    

    LinkListOperation()
    {
        this.size =0; // Initializing size with zero
    }

    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
        Node head; // Initailizing head variable

        //Operations on LinkedList

        // 1-> Add at first postion

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

    public static void main(String[] args) {
        LinkListOperation ll = new LinkListOperation();
        ll.addFirst("Malik");
        ll.addLast("Javed");
        System.out.println(ll.getSize());
        // ll.deleteFirst();
        // ll.deleteLast();
        ll.printList();

    }
}
