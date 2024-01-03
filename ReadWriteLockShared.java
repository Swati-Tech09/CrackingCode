import java.util.concurrent.locks.ReadWriteLock;

public class ReadWriteLockShared {
    public void add(ReadWriteLock lock) {
        System.out.println("lock acquired " + Thread.currentThread().getName());
        try {
            lock.readLock().lock();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally
        {
            lock.readLock().unlock();
            System.out.println("lock released " + Thread.currentThread().getName());
        }
    }

    public void consume(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("lock acquired Write " + Thread.currentThread().getName());
        }
        catch(Exception e)
        {

        }

        finally
        {
            lock.writeLock().unlock();
            System.out.println("lock released Write " + Thread.currentThread().getName());
        }
    }
}
