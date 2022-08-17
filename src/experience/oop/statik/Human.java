package experience.oop.statik;
//        incher kan static barov sksvox ka 4 tex
//        static popoxakaner,statik blokner,static metodner ,static classner
//        statik popoxakan haytararerluc petke popoxakani tipic araj dnel static bary
//        orinak` private static int age
//        orinak public static String name = "IFC";
//        staticy verabervum e classin ete uzenaq tarber obyektner sarkenq bolori hamr nuyny kexni
//       ete guzenq tvac arjeqy poxenq petke classi anunov kanchenq

public class Human {
    public String name;
    public int year;

    public static int count = 0;

    public Human() {
        count++;
    }
    //    static bloki orinak static bloki imasty stataic popoxakannerin skzbnakan arjeq taln e
//   static blokner karanq shat unenq u amenaskzbic ashxatume static bloky heto nor mnacacy

    static int a;
    static int b;

    static {
        a = 45;
        System.out.println("value of a is set to 45");
        b = 15;
    }



}
