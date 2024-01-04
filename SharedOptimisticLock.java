import java.util.concurrent.locks.StampedLock;

public class SharedOptimisticLock {
    int a =10;
    StampedLock lock = new StampedLock();

    public void producer()
    {
        System.out.println("Optimistic lock read -" + Thread.currentThread().getName());
        long stamp = lock.tryOptimisticRead();
        try {
            a=11;
            Thread.sleep(3000);
            if(lock.validate(stamp))
            {
                System.out.println("Updated successfully - " +Thread.currentThread().getName());
            }
            else
            {
                System.out.println("rollback of write -" +Thread.currentThread().getName());
                a=10;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void consumer()
    {
        long stamp = lock.writeLock();
        System.out.println("Write lock - "+Thread.currentThread().getName());
        try
        {
         a=9;
        }
        finally {
            lock.unlockWrite(stamp);
            System.out.println("write lock released by "+Thread.currentThread().getName());

        }

    }


}
