package bolum_12_collection_framework._1_list_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class _1ListInterfaceMethodlari {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("List: " + numbers);
        System.out.println("0. indexteki eleman: " + numbers.get(0));
        System.out.println("1. indexteki eleman: " + numbers.get(1));
        System.out.println("2. indexteki eleman: " + numbers.get(2));

        numbers.set(1, 20);
        System.out.println("List: " + numbers);
        numbers.add(2, 30);
        System.out.println("List: " + numbers);

        numbers.remove(3);
        numbers.add(20);
        System.out.println("List: " + numbers);

        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.lastIndexOf(20));

        ListIterator<Integer> listIterator = numbers.listIterator();
        System.out.println("Listenin listIterator ile gezilmesi: ");
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        List<Integer> newList = numbers.subList(2, 5);
        System.out.println("Yeni liste: " + newList);

    }
}
