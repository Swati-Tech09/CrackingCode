import java.sql.SQLOutput;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//ReadWriteLock - can put shared lock on multiple thread , exclusive lock cant be put
// if resource is already shared.  if exclusive lock applied , no other thread can enter
public class ReadWriteLockMain {
    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        ReadWriteLockShared readWriteLockShared = new ReadWriteLockShared();

        Thread t1=new Thread(()->{
            System.out.println("Thread name " + Thread.currentThread().getName());
            readWriteLockShared.add(lock);
        });


        Thread t2=new Thread(()->{
            System.out.println("Thread name " + Thread.currentThread().getName());
            readWriteLockShared.add(lock);
        });

        ReadWriteLockShared readWriteLockShared1 = new ReadWriteLockShared();
        Thread t3=new Thread(()->{
            System.out.println("Thread name " + Thread.currentThread().getName());
            readWriteLockShared.consume(lock);
        });

        t1.start();
        t2.start();
        t3.start();


        System.out.println("Main thread Exit " + Thread.currentThread().getName());
    }
}
