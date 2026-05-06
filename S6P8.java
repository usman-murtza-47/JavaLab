public class DeadlockDemo {
    public static void main(String[] args) {
        Object r1 = new Object();
        Object r2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread 1 locked Resource 1");
                synchronized (r2) {
                    System.out.println("Thread 1 locked Resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread 2 locked Resource 2");
                synchronized (r1) {
                    System.out.println("Thread 2 locked Resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
