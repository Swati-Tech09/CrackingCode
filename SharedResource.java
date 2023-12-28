public class SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem()
    {
        isItemPresent=true;
        System.out.println("Producer Thread inside addItem method");
        notifyAll();
    }

    public synchronized void consumeItem()
    {
        System.out.println("Consumer Thread inside ConsumeItem method");
        if(!isItemPresent)
        {
            try
            {
                System.out.println("Consumer thread is waiting");
                wait();
            }
            catch(Exception e)
            {
                System.out.println("Exception");
            }
        }

        isItemPresent = false;
    }

}
