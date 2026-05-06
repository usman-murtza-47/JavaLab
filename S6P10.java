class LifeCycleDemo extends Thread {
    public void run() {
        try {
            System.out.println("Running: " + Thread.currentThread().getState());
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws Exception {
        LifeCycleDemo t = new LifeCycleDemo();

        System.out.println("New: " + t.getState());

        t.start();
        System.out.println("Runnable: " + t.getState());

        Thread.sleep(500);
        System.out.println("Timed Waiting: " + t.getState());

        t.join();
        System.out.println("Terminated: " + t.getState());
    }
}
