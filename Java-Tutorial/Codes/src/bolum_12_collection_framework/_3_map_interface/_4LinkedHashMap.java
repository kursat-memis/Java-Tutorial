package bolum_12_collection_framework._3_map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class _4LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Character> alphabe = new LinkedHashMap<>();
        alphabe.put(1, 'a');
        alphabe.put(2, 'b');
        alphabe.put(3, 'c');
        alphabe.put(4, 'd');
        alphabe.put(5, 'e');
        // Elemanları eklediğimiz sıraya göre gezebiliriz.
        System.out.println(alphabe);

        System.out.println("--------------------");

        for (Map.Entry<Integer, Character> temp : alphabe.entrySet()) {
            System.out.println(temp);
        }

        // Bu constructor sayesinde erişilen eleman en sona atılır. Ve ekrana yazdırdığımızda onu son eleman olarak görürüz.
        LinkedHashMap<Integer, Character> alphabe2 = new LinkedHashMap<>(16, 0.75f, true);
        alphabe2.put(1, 'a');
        alphabe2.put(2, 'b');
        alphabe2.put(3, 'c');
        alphabe2.put(4, 'd');

        alphabe2.put(1, 'z');
        alphabe2.get(3);
        System.out.println(alphabe2);

    }
}
