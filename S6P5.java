class PriorityDemo extends Thread {
    public PriorityDemo(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }

    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo("Low");
        PriorityDemo t2 = new PriorityDemo("Normal");
        PriorityDemo t3 = new PriorityDemo("High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
