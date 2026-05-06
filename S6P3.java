class SleepDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Before sleep: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("After sleep: " + i);
        }
    }

    public static void main(String[] args) {
        SleepDemo t = new SleepDemo();
        t.start();
    }
}
