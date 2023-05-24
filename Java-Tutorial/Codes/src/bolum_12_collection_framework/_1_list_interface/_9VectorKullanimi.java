package bolum_12_collection_framework._1_list_interface;

import java.util.Enumeration;
import java.util.Vector;

public class _9VectorKullanimi {
    public static void main(String[] args) {
        /*Vector<Integer> vector1 = new Vector<>(); // Varsayılan kapasite 10 olacak şekilde vector oluşturdu.
        Vector<Integer> vector2 = new Vector<>(20, 2); // Kapasitesi 20 ve kapasite artışı 2 olan vector.
        Vector<Integer> vector3 = new Vector<>(30); // Varsayılan kapasite 30 olacak şekilde vector oluşturuldu. Kapasite artımında boyut iki katına çıkar.
        Vector<Integer> vector4 = new Vector<>(vector1); // Parametre olarak gelen collection'ın içerdiği elemanları tutan vector.*/

        // Vector class'ı, list interface'inden geldiği için oradaki methodları kullanabilir.
        // Kendine özgü methodları:

        Vector<Integer> vector = new Vector<>(2, 5);

        // Arkaplanda tutulan dizinin boyutunu verir.
        System.out.println("Başlangıc kapasitesi: " + vector.capacity());
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Eklenen eleman sayısı kapasiteyi geçince yeni oluşan kapasite: " + vector.capacity());

        // Vectorun sonuna eleman ekler.
        vector.addElement(4);
        System.out.println("Vector: " + vector);

        // Vector'un elemanlarını, parametre olarak girilen diziye kopyalar.
        Integer[] copy = new Integer[4];
        vector.copyInto(copy);
        printArray(copy);

        // Belirtilen index'deki elemanı return eder.
        System.out.println(vector.elementAt(1));

        // Kapasiteyi belirtilen kapasite yapar. (Kapasite, mevcut kapasiteden daha düşük olarak set edilemez.)

        System.out.println("Capacity: " + vector.capacity());
        vector.ensureCapacity(10);
        System.out.println("New Capacity: " + vector.capacity());

        // Vector'ün size'ını belirler. (Kapasitesini belirler.)
        vector.setSize(11);
        System.out.println("Vector: " + vector);

        // Iterator'ın vector için hali; Enumeration. (Iterator ve ListIterator'da vector için kullanılabilir.)

        Enumeration<Integer> enumeration = vector.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Vector<Integer> v1 = new Vector<>(2);
        v1.add(1);
        v1.add(2);
        v1.remove(1);

        System.out.println("Capactiy: " + v1.capacity()); // eleman silinince arkaplandaki dizinin boyutu azalmaz.


    }

    private static void printArray(Integer[] copy) {
        for (Integer temp : copy) {
            System.out.println(temp);
        }
    }
}
