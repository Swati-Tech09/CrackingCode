public class EvenAndOdd {
    public static void main(String[] args) {
        int [] num ={2,3,5,1,10};

     Runnable r1=()->
        {
         for(int a : num)
         {
             if (a%2==0)
                 System.out.println("It is even-" +a);
             System.out.println(Thread.currentThread().getName());
             try {
                 Thread.sleep(5000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
        };

        Runnable r2=()->
        {
            for(int a : num)
            {
                if (a%2!=0)
                    System.out.println("It is odd-" +a);
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName());

    }
}
