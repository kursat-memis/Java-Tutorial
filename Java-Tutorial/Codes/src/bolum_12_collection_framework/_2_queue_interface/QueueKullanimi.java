package bolum_12_collection_framework._2_queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueKullanimi {
    public static void main(String[] args) {
        Queue<String> cities = new LinkedList<>();
        cities.offer("Bayburt");
        cities.offer("Erzurum");
        cities.offer("Zonguldak");
        cities.offer("Trabzon");
        cities.offer("Adana");

        // Queue FIFO prensibiyle calisir ancak; sout, for gibi yapılarla queue üzerinde gezindiğimiz zaman bu prensibi görmeyiz.
        System.out.println(cities);

        // FIFO prensibini görmek için Queue'nun methodlarını kullanmamız gerekir.
        System.out.println("Cikan eleman: " + cities.poll());
        System.out.println("Cikan eleman: " + cities.poll());

        System.out.println("Queue'nun basindaki eleman: " + cities.peek());

    }
}

