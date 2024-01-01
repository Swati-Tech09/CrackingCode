public class ProducerConsumerLearning {
    public static void main(String[] args)  {
    SharedProCon sharedBuffer = new SharedProCon(3);

    Thread producerThread=new Thread(()-> {

        try {
            for (int i = 0;i<=6;i++) {
                sharedBuffer.produce(i);
                System.out.println("Produce" +i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    Thread consumerThread=new Thread(()-> {

            try {
                for (int i = 0;i<=6;i++) {
                    sharedBuffer.consume();
                    System.out.println("Consume" +i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}
