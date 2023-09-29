import java.util.concurrent.atomic.AtomicInteger;

public class ThreadRaceExample {
    public static void main(String[] args) throws InterruptedException {
        class A
        {
            int count;
            public synchronized void show()
            {
                count=count+1;
            }
        }

        A a= new A();
        Runnable obj1=()->
        {
            for (int i=0;i<1000;i++)
            {
                a.show();
            }
        };

        Runnable obj2=()->
        {
            for (int i=0;i<1000;i++)
            {
                a.show();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(a.count);


    }
}
