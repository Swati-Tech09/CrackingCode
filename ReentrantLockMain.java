import java.util.concurrent.locks.ReentrantLock;

//ReentrantLock- it lock the resource and doesnt allow any object to go into critical section
public class ReentrantLockMain {
    public static void main(String[] args) {
        ReentrantLock lock =new ReentrantLock();
        SharedReentrantLock sharedReentrantLock =new SharedReentrantLock();
        Thread t1=new Thread(()->{
            sharedReentrantLock.produce(lock);
        });

        SharedReentrantLock sharedReentrantLock1 =new SharedReentrantLock();
        Thread t2=new Thread(()->{
            sharedReentrantLock1.produce(lock);
        });

        t1.start();
        t2.start();

        System.out.println("Main thread exit");

    }
}
