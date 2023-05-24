package bolum_12_collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class _1CollectionInterfaceMethodlari {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();

        System.out.println("Is Collection empty? " + numbers.isEmpty());
        System.out.println("The size of the Collection: " + numbers.size());
        System.out.println("Elemen başarılı bir şekilde eklendi mi? " + numbers.add(1));
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Is Collection empty? " + numbers.isEmpty());
        System.out.println("The size of the Collection: " + numbers.size());
        System.out.println("Eleman başarılı bir şekilde silindi mi?" + numbers.remove(10));
        System.out.println("Eleman başarılı bir şekilde silindi mi?" + numbers.remove(5));

        System.out.println("--------------------------------------------");

        System.out.println("Collection: " + numbers);
        System.out.println("Is there 30 in the Collecion? " + numbers.contains(30));
        System.out.println("Is there 3 in the Collecion? " + numbers.contains(3));
        Iterator<Integer> iterator = numbers.iterator(); // iterator nesnesi döner. Ve bu nesne üzerinden Collection'ı gezebiliriz.
        // Bu method, Iterable interface'inden gelir.

        System.out.println("Iterator ile collection'un gezilmesi:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--------------------------------------------");

        Object[] arr = numbers.toArray();
        printArray(arr);
        Integer[] dizi;
        dizi = numbers.toArray(new Integer[0]);
        printArray(dizi);

        System.out.println("--------------------------------------------");

        System.out.println("The hashcode of the Collection: " + numbers.hashCode());
        Collection<Integer> otherCollection = new ArrayList<>();
        System.out.println("İki collection eşit mi? " + numbers.equals(otherCollection));
        otherCollection.add(1);
        otherCollection.add(2);
        otherCollection.add(3);
        otherCollection.add(4);
        System.out.println("İki collection eşit mi? " + numbers.equals(otherCollection));

        otherCollection.remove(1);
        otherCollection.remove(3);

        System.out.println("--------------------------------------------");

        System.out.println("Collectionlar güncellendi.");
        System.out.println("Collection: " + numbers);
        System.out.println("Other Collection: " + otherCollection);

        System.out.println("Collection, otherCollection'ın bütün elemanlarını içeriyor mu? "
                + numbers.containsAll(otherCollection));
        otherCollection.add(7);
        System.out.println("Collection, otherCollection'ın bütün elemanlarını içeriyor mu? "
                + numbers.containsAll(otherCollection));

        System.out.println("--------------------------------------------");

        System.out.println("Collection: " + numbers);
        System.out.println("Other Collection: " + otherCollection);

        numbers.addAll(otherCollection); // otherCollection elemanlarını, numbers'a ekler.

        System.out.println("Collection: " + numbers);

        numbers.removeAll(otherCollection); // otherCollection'da bulunan elemanları numbers'dan kaldırır.
        System.out.println("Collection " + numbers);

        numbers.clear(); // Collection'ın elemanlarını temizler.
        otherCollection.clear();

        System.out.println("--------------------------------------------");
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(8);
        numbers.add(10);
        otherCollection.add(2);
        otherCollection.add(3);
        otherCollection.add(7);
        otherCollection.add(10);
        otherCollection.add(10);
        otherCollection.add(8);

        System.out.println("Collection: " + numbers);
        System.out.println("Other Collection: " + otherCollection);

        numbers.retainAll(otherCollection);

        System.out.println("Collection: " + numbers);
        System.out.println("Other Collection: " + otherCollection);
        
    }

    private static void printArray(Object[] arr) {
        System.out.println("********* Print Array *********");
        for (Object temp : arr) {
            System.out.println(temp);
        }
    }

    private static void printArray(Integer[] arr) {
        System.out.println("********* Print Array (Integer)*********");
        for (Integer temp : arr) {
            System.out.println(temp);
        }
    }
}


