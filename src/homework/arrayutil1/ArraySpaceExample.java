package homework.arrayutil1;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ', ' ', ' ', ' ', ' '};
        int c = 0;
        int x = spaceArray.length-1;
        while (spaceArray[c] == ' ') {
            c++;
        }
        while (spaceArray[x] == ' ') {
            x--;
        }
        char[] result = new char[x - c + 1];
        for (int i : result) {
            result[i] = spaceArray[c];
            c++;
            System.out.print(result[i]);

        }
    }
}
