package bolum_12_collection_framework._1_list_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class _8ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        createCollection(arrayList);
        createCollection(linkedList);

        // Başa eleman ekleme (Eleman silmede aynı mantık.)
        long start = System.currentTimeMillis();
        arrayList.add(0,-1);
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("ArrayList için başa eleman ekleme süresi: " + result);

        start = System.currentTimeMillis();
        linkedList.addFirst(-1);
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("LinkedList için başa eleman ekleme süresi: " + result);

        // Ortaya eleman ekleme
        start = System.currentTimeMillis();
        arrayList.add(10000000/2, -1);
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("ArrayList için ortaya eleman ekleme süresi: " + result);

        start = System.currentTimeMillis();
        linkedList.add(10000000/2, -1);
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("LinkedList için ortaya eleman ekleme süresi: " + result);

        // Sona eleman ekleme
        start = System.currentTimeMillis();
        arrayList.add(arrayList.size(), -1-1);
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("ArrayList için sona eleman ekleme süresi: " + result); // Son indexe random access'la eriştiği için hızlı.

        start = System.currentTimeMillis();
        linkedList.add(linkedList.size()-1,-1);
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("LinkedList için sona eleman ekleme süresi: " + result); // Son node'u gösteren bir pointer olduğundan dolayı hızlı.

        // Eleman okuma

        start = System.currentTimeMillis();
        System.out.println(arrayList.get(arrayList.size()/2));
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("ArrayList için eleman okuma süresi: " + result);

        start = System.currentTimeMillis();
        System.out.println(linkedList.get(linkedList.size()/2));
        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("LinkedList için eleman okuma süresi: " + result);
    }

    private static void createCollection(Collection<Integer> collection) {
        for (int i = 0; i<10000000; i++) {
            collection.add(i);
        }
    }
}
