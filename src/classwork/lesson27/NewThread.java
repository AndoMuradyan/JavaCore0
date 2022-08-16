package classwork.lesson27;

public class NewThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Docherni patok " + i);
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Docherni patok zavershen: ");
    }
}
