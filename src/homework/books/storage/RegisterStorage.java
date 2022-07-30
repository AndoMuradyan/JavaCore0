package homework.books.storage;

import homework.books.model.Register;


public class RegisterStorage {
    private Register[] array = new Register[10];
    private int size = 0;


    public Register add(Register register) {
        if (size == array.length) {
            extend();
        }
        array[size++] = register;
        return register;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }

    }

    private void extend() {
        Register[] tmp = new Register[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, size);
        array = tmp;
    }


    boolean isEmpty() {
        return size == 0;

    }


    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {

            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];

            }
            size--;
        }

    }


    public int getSize() {
        return size;
    }

    public Register getRegisterByLessonName(int index) {
        if (index < 0 || index >= size) {

            return null;
        }
        return array[index];
    }


    public Register getRegisterByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)) {
                return array[i];
            }


        }
        return null;
    }
    public Register getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)) {
                return array[i];

            }
        }
        return null;
    }



}




