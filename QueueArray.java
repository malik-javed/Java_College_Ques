public class QueueArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n)
        {
            arr = new int[n];
            this.size = n;
        }

        // Checking Queue is Empty or Not
        public static boolean isEmpty()
        {
            return rear==-1;
        }

        //Queue is Full or Not
        public static boolean isFull()
        {
            return rear==size-1;
        }

        //Enqueue -> Adding Element
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue -> Deleting Elements
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Already Empty");
                return -1;
            }
            
            int front = arr[0];
            
            // now shifting elements to left
            for(int i=0;i<rear;i++)
            {
                arr[i] = arr[i+1];
            }
            rear--;

            return front;

        }

        // Peek -> what elements is at Peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];
            return front;
        }

        // printing elements
        public static void print()
        {
            for(int i=0;i<=rear;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }

    
    


    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(2);
        q.add(4);
        q.add(6);
        // q.remove();
        // q.print();

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
