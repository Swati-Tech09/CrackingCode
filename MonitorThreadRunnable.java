public class MonitorThreadRunnable {

   /* synchronized void task1() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Inside task1 ");
    }*/

  void task1() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Inside task1 ");
    }

    void task2()
    {
        System.out.println("Before synchronised");
        synchronized (this)
        {
            System.out.println("Inside task2");
        }
    }

    void task3()
    {
        System.out.println("Inside task3");
    }
}
