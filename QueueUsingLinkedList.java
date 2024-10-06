public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    static class QueueList{
        static Node head=null;
        static Node tail=null;

        // Empty Check
        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }

        // Add -> O(1)
        public static void add(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty()) // adding 1st element
            {
                head = tail = newNode;
                return;
            }
            
            tail.next = newNode;
            tail = newNode;
        }


        // remove -> O(1)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Already Empty");
                return -1;
            }

            int result = head.data;
            if(head == tail) // if there is only 1 element
            {
                tail = null;
            }
            head = head.next;
            return result;
        }

        // peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }

            
            return head.data;
        }


    }

    public static void main(String[] args) {
        QueueList q = new QueueList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
