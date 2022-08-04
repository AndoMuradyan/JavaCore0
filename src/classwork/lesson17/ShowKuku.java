package classwork.lesson17;

public interface ShowKuku {
    default void printKuku(){
        System.out.println("K U K U");
    }
    static  int getDefaultCount(){
        return 1;
    }

}
