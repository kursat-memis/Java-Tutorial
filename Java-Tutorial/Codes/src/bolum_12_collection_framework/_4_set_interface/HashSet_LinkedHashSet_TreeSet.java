package bolum_12_collection_framework._4_set_interface;

import java.util.*;

public class HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        HashSet<String> isimler = new HashSet<>();
        isimler.add("emre");
        isimler.add("ali");
        isimler.add("hüseyin");
        isimler.add("burak");

        System.out.println("Isimler: " + isimler);

        LinkedHashSet<String> isimler2 = new LinkedHashSet<>();
        isimler2.add("emre");
        isimler2.add("ali");
        isimler2.add("hüseyin");
        isimler2.add("burak");

        System.out.println("Isimler: " + isimler2);

        TreeSet<String> isimler3 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) return -1;
                else if(o1.length() > o2.length()) return 1;
                else return 0;
            }
        }); // elemanlar length'e göre sıralanır.
        isimler3.add("emre");
        isimler3.add("ali");
        isimler3.add("hüseyin");
        isimler3.add("burak");

        System.out.println("Isimler: " + isimler3);
    }
}
