package bolum_12_collection_framework._1_list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class _6LinkedListKullanimi {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(-1);
        arrList.add(0);
        arrList.add(1);
        LinkedList<Integer> ll2 = new LinkedList<>(arrList);
        System.out.println(ll2);

        System.out.println("-------------------------------------------");

        LinkedList<Integer> linkedList = new LinkedList<>();
        // LinkedList'in sonuna eleman ekler. (Arka planda linkLast methodunu cağirir.)
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);

        // Belirtilen indexe belirtilen elemanı ekler.
        linkedList.add(1, 2);
        System.out.println("LinkedList: " + linkedList);

        // LinkedList'in sonuna, parametre olarak aldığı Collection'ın elemanlarını ekler.
        linkedList.addAll(arrList);
        System.out.println("LinkedList: " + linkedList);

        // Belirtilen index'ten başlayarak parametre olarak aldığı Collection'ın elemanlarını LinkedList'e ekler.
        linkedList.addAll(1, arrList);
        System.out.println("LinkedList: " + linkedList);

        // LinkedList'in başına elemanı ekler.
        linkedList.addFirst(-100);

        // LinkedList'in sonuna elemanı ekler.
        linkedList.addLast(100);
        System.out.println("LinkedList: " + linkedList);

        // Bütün elemanları LinkedList'den siler.
        linkedList.clear();
        System.out.println("LinkedList: " + linkedList);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // LinkedList'in kopyasını dönderir.
        LinkedList<Integer> copyLinkedList = (LinkedList<Integer>) linkedList.clone();
        linkedList.set(1, 100); // LinkedList üzerinde yapılan değişiklikler kopyayı etkilemez.
        System.out.println(copyLinkedList);

        // LinkedList, parametredeki elemanı içeriyorsa true return eder.
        System.out.println("Does LinkedList contain 1000? " + linkedList.contains(1000));
        System.out.println("Does LinkedList contain 1? " + linkedList.contains(1));
        System.out.println("LinkedList: " + linkedList);

        // LinkedList'in ilk elemanını return eder. LinkedList boşsa, NoSuchException fırlatır.(Arkaplanda getFirst() methodunu cağirir.)
        System.out.println(linkedList.element());

        // Belirtilen indexteki elemanı return eder.
        System.out.println(linkedList.get(1));

        // İlk elemanı return eder.
        System.out.println(linkedList.getFirst());

        // Son elemanı return eder.
        System.out.println(linkedList.getLast());

        // Parametre olarak aldığı değer listede varsa, o değerin indexini return eder. Listede yoksa -1 return eder.
        System.out.println(linkedList.indexOf(1000));
        System.out.println(linkedList.indexOf(100));

        // Parametre olarak aldığı değer listede varsa, o değerin son indexini return eder. Listede yoksa -1 return eder.
        linkedList.add(3);
        System.out.println(linkedList.lastIndexOf(1000));
        System.out.println(linkedList.lastIndexOf(3));

        System.out.println("LinkedList: " + linkedList);
        // İlk elemanı kaldırır.
        linkedList.remove();
        System.out.println("LinkedList: " + linkedList);

        // Belirtilen indexteki elemanı kaldırır.
        linkedList.remove(1);
        System.out.println("LinkedList: " + linkedList);

        // Belirtilen Objeyi kaldırır.
        linkedList.remove((Object)100);
        System.out.println("LinkedList: " + linkedList);

        // İlk elemanı kaldırır ve değerini return eder.
        System.out.println(linkedList.removeFirst());
        System.out.println("LinkedList: " + linkedList);

        // Son elemanı kaldırır ve değerini return eder.
        linkedList.add(1);
        System.out.println(linkedList.removeLast());
        System.out.println("LinkedList: " + linkedList);

        System.out.println("--------------------------------------");

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);

        // Belirtilen öğeyi kaldırır. (LinkedList'i baştan sona gezerken ilk karşılaştığı.)
        linkedList.removeFirstOccurrence(1);

        // Belirtilen öğeyi kaldırır. (LinkedList'i baştan sona gezerken son karşılaştığı.)
        linkedList.removeFirstOccurrence(1);

        System.out.println("LinkedList: " + linkedList);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println("LinkedList: " + linkedList);

        // Belirtilen indexteki elemanı, belirtilen value değeriyle değiştirir.
        linkedList.set(3, 100);
        System.out.println("LinkedList: " + linkedList);

        // LinkedList'in boyutunu return eder.
        System.out.println("Size: " + linkedList.size());

        // LinkedList'i, Array'e dönüştürür.
        Object[] arr = linkedList.toArray();
        printArray(arr);

        // LinkedList'i, Array'e dönüştürür. (Arrayin tipi, parametre olarak belirtilendir.)

        Integer[] arr2 = linkedList.toArray(new Integer[0]);
        printArray(arr2);

        // LinkedList elemanlarını String'e çeviriyor.
        String _string = linkedList.toString();
        System.out.println(_string);

        // descendingIterator(): LinkedList üzerinde, sondan başlayan ve başa kadar gidecek olan bir iterator dönderir.
        System.out.println("LinkedList: " + linkedList);
        Iterator<Integer> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println("Value: " + iterator.next());
        }

        // Aşağıdaki methodlar queue ve stack methodlarıdır.
        // LinkedList Deque interface'inide implement ettiğinden dolayı bu methodlara sahiptir.

        // offer()
        // offerFirst()
        // offerLast()
        // peek()
        // peekFirst()
        // peekLast()
        // pool()
        // poolFirst()
        // poolLast()
        // pop()
        // push()
    }

    private static void printArray(Object[] arr) {
        for (Object temp : arr) {
            System.out.println(temp);
        }
    }
}
