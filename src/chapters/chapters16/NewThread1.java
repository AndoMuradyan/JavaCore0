package chapters.chapters16;

public class NewThread1 extends Thread {
    NewThread1() {
        super("Демонстрационный поток");
        System.out.println("Дoчepний поток : " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println( "Дoчepний поток прерван.");
        }
        System.out.println( "Дoчepний поток завершен .");
    }
}
