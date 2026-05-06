class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws Exception {
        while (available) wait();
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() throws Exception {
        while (!available) wait();
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    b.produce(i);
                } catch (Exception e) {
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    b.consume();
                } catch (Exception e) {
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
