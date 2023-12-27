public class MainThreadExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadExample1 threadExample1 = new ThreadExample1();
        Thread t1 = new Thread(threadExample1);
        t1. start();
        t1.join();// wait for the t1 to complete
        System.out.println(Thread.currentThread().getName());
    }
}
