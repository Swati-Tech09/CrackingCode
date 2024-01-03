public class WalletApplication {
    public static void main(String[] args) {
        Awallet aWallet = new Awallet();
        Bwallet bWallet = new Bwallet();
        System.out.println(" Thread started " + Thread.currentThread().getName());
        Thread t1= new Thread(()->{
            aWallet.addAmount();
        });
        Thread t2= new Thread(()->{
            bWallet.addAmount();
        });
        t1.setName("Awallet Thread");
        t1.start();
        t2.setName("Bwallet Thread");
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Successfully AWallet & B Wallet amount updated " + " message from "+ Thread.currentThread().getName());
    }
}
