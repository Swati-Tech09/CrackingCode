public class SharedResourceExample1 {

    private boolean IsAvailable=false;
    public synchronized void  consume()
    {
        System.out.println("Lock acquired");
        IsAvailable =true;
        System.out.println("IsAvailable" +IsAvailable);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Lock Released");

    }
}
