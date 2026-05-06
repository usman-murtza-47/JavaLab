class DaemonDemo extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) throws Exception {
        DaemonDemo t = new DaemonDemo();
        t.setDaemon(true);
        t.start();

        Thread.sleep(5000);
        System.out.println("Main thread ends");
    }
}
