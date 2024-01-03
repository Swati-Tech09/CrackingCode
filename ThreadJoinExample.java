public class ThreadJoinExample {
    //Main Thread waits until the thread spawn complete
    public static void main(String[] args) {
        SharedResourceExample1 sh = new SharedResourceExample1();

        Thread t1= new Thread(()->{
            System.out.println("Thread1 start");
            sh.consume();
        });

        t1.start();

        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main Thread exit");
    }
}
