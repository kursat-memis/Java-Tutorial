package bolum_12_collection_framework._1_list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _3ListeyiGezmek {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);

        System.out.println("For döngüsü ile listeyi gezmek:");
        for (int i = 0; i < numbers1.size(); i++) {
            System.out.println(numbers1.get(i));
        }

        System.out.println("For each ile listeyi gezmek:");
        for (Integer temp : numbers1) {
            System.out.println(temp);
        }

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);

        System.out.println("----------------------------------");
        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);

        //System.out.println("ArrayList'lerde ortak bulunan elemanları numbers1'den kaldıralım....");
        /*for (int i = 0; i<numbers1.size(); i++) {
            if (numbers2.contains(numbers1.get(i))) {
                numbers1.remove(i);
            }
        }

        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);*/

        // indexler üzerinde bir oynama söz konusu olduğunda, sonuçta hata almamak için iterator - listitarator kullanmak gerekir.


        System.out.println("Iterator ile listeyi gezme:");
        Iterator<Integer> iterator = numbers1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("ArrayList'lerde ortak bulunan elemanları numbers1'den kaldıralım....");

        iterator = numbers1.iterator();

        while (iterator.hasNext()) {
            if (numbers2.contains(iterator.next())) {
                iterator.remove();
            }
        }

        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);

        // iterator'ın biraz daha gelişmiş versiyonu: listIterator
        System.out.println("ListIterator ile listeyi gezmek:");
        ListIterator<Integer> listIterator = numbers2.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("ListIterator ile listeyi sondan basa gezmek:");
        listIterator = numbers2.listIterator(numbers2.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
