package chapters.chapters10;

import javax.security.auth.callback.Callback;

 class Client implements Callback {

    public void callback(int p) {
        System.out.println("Metod callback(), вызываемый со значением" + p);

    }

    void nonIfaceMeth() {
        System.out.println(" B классах , реализующих интерфейсы , " + "могут определяться и другие члены.");
    }

}
