class JoinDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }

    public static void main(String[] args) throws Exception {
        JoinDemo t = new JoinDemo();
        t.start();
        t.join();
        System.out.println("Main thread resumes execution.");
    }
}
