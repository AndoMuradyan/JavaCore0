package classwork.lesson24;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
//      elementy verji qcacy ktpe
//      polly remove kene khane u kjnje

        queue.add("petros");
        queue.add("poxos");
        queue.add("martiros");
        System.out.println(queue.element());
        System.out.println(queue.poll());

//      polly nayev tpeluc sortavorac ktpe
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        qu.add(3);
        qu.add(2);
        qu.add(6);
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.poll());


    }
}
