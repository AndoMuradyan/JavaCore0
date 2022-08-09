package experience.thread;

public class Counter {
    //    private String name;
//
//
//    public Counter(String name){
//        this.name=name;
//    }
    public boolean first = true;

    public synchronized void count(String name) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 5 && first) {
                first = false;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (i == 10 && !first) {
                notifyAll();
            }
        }
    }
}
