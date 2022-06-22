package homework.dynamicarray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;
    private int index;


    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;

    }





    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }

    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    //Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false
    boolean isEmpty() {
        return size == 0;

    }

    //    Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
    int getByIndex(int index) {

        return array[index];

    }
    //Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը

    int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                value = i;
                break;

            }
        }
        return value;
    }
    //Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)

    public void delete(int index) {
        for (int i = index; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;


    }

    //Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).

    int set(int index, int value) {
        return array[index] = value;
    }
    //Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի

    public void add1(int index, int value) {
        for (int i = size; i > index; i--) {

            array[i] = array[i - 1];
        }
        array[index] = value;

        size++;
    }

}




