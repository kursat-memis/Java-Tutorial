package bolum_12_collection_framework._1_list_interface;

import java.util.ArrayList;
import java.util.List;

public class _2ArrayListKullanimi {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> surnames = new ArrayList<>(10);
        names.add("Kursat");
        names.add("Alperen");
        names.add("Sefik");
        names.add("Erdem");
        surnames.add("Memis");
        surnames.add("Kochan");
        surnames.add("Ozger");
        surnames.add("Suslu");
        surnames.add("Bayram");

        System.out.println("Names: " + names);
        names.add(1, "Habib");
        System.out.println("Names: " + names);
        System.out.println("Surnames: " + surnames);

        ArrayList<String> fullNames = new ArrayList<>(names);
        fullNames.addAll(surnames);
        System.out.println("Full Names: " + fullNames);

        ArrayList<String> copyArr = new ArrayList<>();

        copyArr = (ArrayList)fullNames.clone();

        System.out.println("Kursat degerini iceriyor mu? " + fullNames.contains("Kursat"));
        System.out.println("Hakan degerini iceriyor mu? " + fullNames.contains("Hakan"));
        System.out.println("Names arrayListindeki degerleri iceriyor mu? " + fullNames.containsAll(names));

        fullNames.ensureCapacity(30); // arkaplanda kullanılan dizi boyutu 30 oldu.
        System.out.println("Full Names: " + fullNames);
        System.out.println(fullNames.get(1));
        System.out.println(fullNames.indexOf("Kursat"));
        System.out.println(fullNames.lastIndexOf("Kursat"));

        System.out.println("Is ArrayList empty? " + fullNames.isEmpty());
        fullNames.remove(4);
        fullNames.remove("Bayram");
        fullNames.removeAll(surnames);
        fullNames.add("aslı");
        fullNames.add("burak");
        System.out.println("Güncellenen Full Names: " + fullNames);
        fullNames.retainAll(names); // ortak olanları tutar, diğerlerini siler.
        System.out.println("Full Names: " + fullNames);
        fullNames.set(0, "Muhammet Kursat");
        System.out.println("Full Names: " + fullNames);
        System.out.println("The number of the ArrayList: " + fullNames.size()); // ArrayList'de bulunan eleman sayısını return eder.
        List<String> list = fullNames.subList(1,3);
        System.out.println("List: " + list);
        Object[] fullNamesArr = fullNames.toArray();
        System.out.print("Array: ");
        printArray(fullNamesArr);
        String[] arr = fullNames.toArray(new String[0]);
        printArray(arr);
        fullNames.trimToSize(); // ArrayList'in kapasitesini, mevcut eleman kadar ayarlar.
                                // Arkaplandaki dizinin boyutu azalmaz.

    }

    private static void printArray(Object[] fullNamesArr) {
        for (Object temp : fullNamesArr) {
            System.out.print(temp + ",");
        }
        System.out.println();
    }
}
