public class Monitor {
    public static void main(String[] args) {
        Mydata data = new Mydata();

        MyThread1 t1 = new MyThread1(data);
        MyThread2 t2 = new MyThread2(data);

        t1.start();
        t2.start();

    }
}


class Mydata{
// Only Prints the String
    void display(String str)
    {
        // By using * synchronized * this will print wisely 
        synchronized(this)
        {
            for(int i=0; i<str.length(); i++)
            {
                System.out.print(str.charAt(i));
            }
            
        }
    }
}

class MyThread1 extends Thread{
    Mydata d;
    MyThread1(Mydata d)
    {
        this.d=d;
    }

    public void run()
    {
        d.display("Hello World");
    }
}
class MyThread2 extends Thread{
    Mydata d;
    MyThread2(Mydata d)
    {
        this.d=d;
    }

    public void run()
    {
        d.display("Welcome");
    }
}
