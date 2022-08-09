package chapters.chapters16;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Глaвный поток : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Дoчepний поток прерван . ");
        }
        System.out.println("Дoчepний поток завершен . ");
    }
}
