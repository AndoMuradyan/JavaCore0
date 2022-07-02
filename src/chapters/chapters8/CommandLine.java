package chapters.chapters8;

public class CommandLine {
    public static void main(String[] args) {
        String name ="java CommandLine this is а test 100 -1 ";
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]+name);

        }
    }
}
