public class Awallet {
    int amount;
    public void addAmount() {
        amount= amount + 20;
        System.out.println("Amount updated "+ amount + " by " +Thread.currentThread().getName());
    }
}
