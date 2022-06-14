package homework.arrayutil1;

public class CharArrayExample {
    public static void main(String[] args) {

//      1) Ունենք հետևյալ մասիվը՝ունենք նաև մի սինվոլ՝
//      Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։

        char[] cars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int c = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == 'o') {
                c++;
            }
        }
        System.out.print(c);
        System.out.println();

//      2) Ունենք հետևյալ մասիվը՝
//      պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char middle = (char) (chars2.length);
        char middle1 = (char) (chars2.length);
        System.out.println(chars2[middle / 2 - 1] + " " + chars2[middle1 / 2]);


//      3) Ունենք հետևյալ մասիվը՝՝
//      պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char[] text = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y',};
        if (text[text.length - 1] == 'y' && text[text.length - 2] == 'l') {
            System.out.print(true);
        } else
            System.out.println(false);
        System.out.println();


//      5) Ունենք հետևյալ մասիվը՝
//      պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
        char[] text1 = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text1.length; i++) {
            if (text1[i] != ' ') {
                System.out.print(text1[i]);
            }
        }




    }

}








