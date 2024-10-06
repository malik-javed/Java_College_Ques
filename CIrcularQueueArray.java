public class CIrcularQueueArray {
    static class CircularQueue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front =-1;
        CircularQueue(int n)
        {
            arr = new int[n];
            this.size = n;
        }

        // Checking Queue is Empty or Not
        public static boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }

        //Queue is Full or Not
        public static boolean isFull()
        {
            // for cicrular queue
            return (rear+1)%size == front;
        }

        //Enqueue -> Adding Element O(1)
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }

            if(front==-1) // when adding first element, we have to increase front also
            {
                front=0;
            }
            rear = (rear+1)%size;
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
            
            int result = arr[front];
            
            if(rear==front) // we there is only 1 Element
            {
                rear=front=-1;
            }else{

                front = (front+1)%size;
            }

            return result;

        }

        // Peek -> what elements is at Peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            return result;
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        
        cq.remove();
        cq.add(5);
        cq.add(6);

        while(!cq.isEmpty())
        {
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}
