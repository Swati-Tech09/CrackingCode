import java.util.LinkedList;
import java.util.Queue;
public class SharedProCon {
    private Queue<Integer> sharedBuffer;
    private int BufferSize;

    public SharedProCon( int bufferSize) {
        this.sharedBuffer = new LinkedList<>();
        BufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while(sharedBuffer.size()==BufferSize)
        {
            System.out.println("Buffer is full");
            wait();
        }
        sharedBuffer.add(item);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while(sharedBuffer.isEmpty())
        {
            System.out.println("Buffer is empty");
            wait();
        }
        int item =sharedBuffer.poll();
        System.out.println("Item consumed-" + item);
        notify();
        return item;
    }






}
