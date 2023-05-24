package bolum_12_collection_framework._1_list_interface;

import java.util.LinkedList;
import java.util.ListIterator;

public class _7LinkedListSiraliEkle {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        createLinkedList(linkedList, 10);
        System.out.println("LinkedList: " + linkedList);

    }

    private static void createLinkedList(LinkedList<Integer> linkedList, int size) {
        for (int i = 0; i<size;i++) {
            int number = generateRandomNumber();
            System.out.println("Number: " + number);
            addSequentially(linkedList, number);
        }
    }

    private static void addSequentially(LinkedList<Integer> linkedList, Integer number) {
        ListIterator<Integer> listIterator = linkedList.listIterator();
        int n;

        while(listIterator.hasNext()) {
            n = listIterator.next();
            if (number < n) {
                listIterator.previous();
                listIterator.add(number);
                return;
            }
        }
        listIterator.add(number);
    }

    private static Integer generateRandomNumber() {
        int number = (int)(Math.random()*31);
        return number;
    }
}
