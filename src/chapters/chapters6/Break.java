package chapters.chapters6;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Пpeдшecтвyeт оператору break . ");
                    if (t) {
                        System.out.println(" Этoт оператор не будет выполняться");
                        break second;
                    }
                    System.out.println("Этoт оператор не будет выполняться ");
                    System.out.println(" Этoт оператор следует за блоком second . ");
                }
            }
        }
    }
}
