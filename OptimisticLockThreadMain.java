public class OptimisticLockThreadMain {

    //Optimistic Lock - Stamp can validate whether any change been done .if its not match it will
    // rollback
    public static void main(String[] args) {
        SharedOptimisticLock sharedOptimisticLock = new SharedOptimisticLock();

        Thread t1 = new Thread(()->{
            sharedOptimisticLock.producer();});
        Thread t2 = new Thread(()->{
            sharedOptimisticLock.consumer();});
        t1.setName("Thread1");
        t1.start();
        t2.setName("Thread2");
        t2.start();
    }
}
