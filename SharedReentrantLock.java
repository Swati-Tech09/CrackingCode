import java.sql.SQLOutput;
import java.util.concurrent.locks.ReentrantLock;

public class SharedReentrantLock
{
    public void produce(ReentrantLock lock)
    {
        System.out.println("lock acquired " +Thread.currentThread().getName());
        try {
            lock.lock();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
            System.out.println("lock released" +Thread.currentThread().getName());
        }
    }
}
