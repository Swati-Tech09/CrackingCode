public class MultithreadingMain {

    public static void main(String[] args) {
        SharedResourceExample1 sharedResourceExample1 =new SharedResourceExample1();

        System.out.println("Main Thread"+ Thread.currentThread().getName());

        Thread t1= new Thread(()->{
            System.out.println("Thread t1 calling");
            System.out.println("T1 Thread"+ Thread.currentThread().getName());
            sharedResourceExample1.consume();
        });

        Thread t2= new Thread(()->{
            System.out.println("Thread t2 calling");
            System.out.println("T2 Thread"+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResourceExample1.consume();
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main Thread ");


    }
}
