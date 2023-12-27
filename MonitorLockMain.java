public class MonitorLockMain {
    public static void main(String[] args) {
        MonitorThreadRunnable m1 = new MonitorThreadRunnable();
        Thread t1 = new Thread(()->{
            try {
                m1.task1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            m1.task2();
        });


        Thread t3 = new Thread(()->{
            m1.task3();
        });

        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName());

    }
}
