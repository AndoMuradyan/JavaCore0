package experience.thread;

public class ThreadRunVsStart {
    public static void main(String[] args) {
        Thread t = new MyThread("t");
        t.run();

        System.out.println("Main is working");
    }
}
