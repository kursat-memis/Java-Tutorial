package bolum_12_collection_framework._3_map_interface;

import java.util.*;

public class _2HashMapKullanimi {
    public static void main(String[] args) {
        // Map interface'ini impelement eden bir classtır.

        /*HashMap hm1 = new HashMap(); // Başalangıç kapasitesi 16, load factor'ü 0.75 olan bir HashMap.
        HashMap hm2 = new HashMap(16); // Başlangıç kapasitesi belirtilen argüman kadar, load factor'ü 0.75 olan bir HashMap.
        HashMap hm3 = new HashMap(16, 0.75f); // Başlangıç kapasitesi ve load factor'ü belirtilen argümanlar kadar olan bir HashMap.
        HashMap hm4 = new HashMap(hm1); // Load factor’ü 0.75 olan ve kapasitesi argüman olarak gönderilen map objesini tutabilecek düzeyde olan
                                        // bir map oluşturur.*/


        HashMap<Integer, String> plakalar = new HashMap<>();
        plakalar.put(69, "Bayburt");
        plakalar.put(25, "Erzurum");
        plakalar.put(61, "Trabzon");
        plakalar.put(16, "Bursa");
        plakalar.put(34, "Istanbul");

        System.out.println("Map: " + plakalar); // Elemanları eklediğim sırada görmem. Çünkü: HashMap'de elemanlar eklendiği sırayla değil
        // hashcode'larına göre tutulur.

        // HashMap'e key değerleri aynı olan farklı value'lar eklemek istersek, bu ikisi birden HashMap'de depolanmaz.
        // Son eklenen key-value çifti, önce eklenmiş olan key-value çiftinin yerine geçer.

        plakalar.put(35, "Afyonkarahisar");
        plakalar.put(35, "Izmir");

        System.out.println("Map: " + plakalar);

        // HashMap'de key veya value değeri null olan elemanlarda tutulabilir.

        plakalar.put(null, null);
        plakalar.put(82, null);
        System.out.println("Map: " + plakalar);

        // HashMap'deki elemanları siler.
        // plakalar.clear();

        // HashMap'in kopyasını üretir. Orjinal - kopya map'de yapılan işlemler diğerini etkilemez.
        HashMap<Integer, String> copyHashMap = (HashMap<Integer, String>) plakalar.clone();
        System.out.println("Copy HashMap: " + copyHashMap);
        System.out.println("Map: " + plakalar);
        copyHashMap.clear();
        plakalar.put(34, "Istanbul");
        System.out.println("Copy HashMap: " + copyHashMap);
        System.out.println("Map: " + plakalar);

        System.out.println("-------------------------------------------------");

        // Belirtilen key değerine sahip eleman map'de mevcutsa true return eder. Yoksa if return eder.
        System.out.println("Key değeri 100 olan eleman var mı? " + plakalar.containsKey(100));
        System.out.println("Key değeri 69 olan eleman var mı? " + plakalar.containsKey(69));

        // Belirtilen value değerine sahip eleman map'de mevcutsa true return eder. Yoksa if return eder.
        System.out.println("Value değeri Diyarbakır olan eleman var mı? " + plakalar.containsValue("Diyabakır"));
        System.out.println("Value değeri null olan eleman var mı? " + plakalar.containsValue(null));

        // Map'in bir küme (set) görüntüsünü return eder.
        Set<Map.Entry<Integer, String>> entry = plakalar.entrySet();
        System.out.println("Entries: " + entry);

        // Bu entry ile map'i gezebiliriz.
        for (Map.Entry<Integer, String> temp : entry) {
            System.out.println(temp);
        }

        System.out.println("-------------------------------------------");

        // Parametre olarak gönderilen key değerine sahip öğe varsa bu öğenin value'sunu return eder. Yoksa null return eder.
        System.out.println(plakalar.get(69));
        System.out.println(plakalar.get(100));

        // Map'de eleman varsa true return eder. Yoksa false return eder.
        System.out.println(plakalar.isEmpty());

        // Parametre olarak gönderilen map'deki öğeleri, map'e ekler.
        Map<Integer, String> plakalarYeni = new HashMap<>();
        plakalarYeni.put(35, "Yeni Izmir"); // Bu key değerine sahip eleman map'de olduğu için, eski value'nun üzerine yazar.
        plakalarYeni.put(01, "Adana");
        plakalar.putAll(plakalarYeni);
        System.out.println(plakalar);

        // Belirtilen key değerine sahip öğeyi siler ve value'sunu return eder. Öğe yoksa null return eder.
        System.out.println(plakalar.remove(35));
        System.out.println(plakalar.remove(100));

        // Belirtilen entry map'de mevcutsa bunu siler ve true return eder. Map'de mevcut değilse false return eder.
        System.out.println(plakalar.remove(34, "Istanbul"));
        System.out.println(plakalar.remove(69, "BaYbUrT"));

        System.out.println("HashMap: " + plakalar);

        // Map'deki entry sayısını return eder.
        System.out.println("Size: " + plakalar.size());

        // Map'deki value'ların Collection görüntüsünü verir.
        Collection<String> values = plakalar.values();
        System.out.println("Values: " + values);

        // Map'deki key'lerin Set görüntüsünü verir.
        Set<Integer> keys = plakalar.keySet();
        System.out.println("Keys: " + keys);

        // İki objeyi karşılaştırır. Aynı objelerse true, aksi halde false return eder. (Referansa göre değil, tuttukları value'a göre kıyaslar.)
        HashMap<Object, Object> hm1 = new HashMap<>();
        HashMap<Object, Object> hm2 = new HashMap<>();
        System.out.println("Equals olarak: " + hm1.equals(hm2));
        System.out.println("Referans olarak: " + (hm1 == hm2));

        // Map'in hashcode'unu return eder.
        System.out.println("Hash code: " + plakalar.hashCode());

        // Map'in String temsilini return eder.
        String s = plakalar.toString();
        System.out.println(s);

        System.out.println("----------------------------------------------------------------");

        System.out.println("HashMap: " + plakalar);

        // Sırayla Entry elemanlarından key ve value değerlerini alır değişkenlere atar. Her seferinde ->'un sag tarafındaki işler.
        plakalar.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

        // Belirtilen key değerine sahip eleman map'de varsa o key'in value'sunu return eder.
        // Eğer eleman map'de yoksa, defaultValue olarak belirtilen değeri return eder.

        System.out.println("69 key değerine sahip eleman: " + plakalar.getOrDefault(69, "Eleman bulunamadı."));
        System.out.println("100 key değerine sahip eleman: " + plakalar.getOrDefault(100, "Eleman bulunamadı."));

        // Belirtilen key değeri, map'de mevcutsa null return eder ancak map'de mevcut değilse key - value çiftini map'e ekler ve key'değerinin
        // value'sunu return eder.

        System.out.println(plakalar.putIfAbsent(81, "Düzce"));
        System.out.println(plakalar.putIfAbsent(69, "Bayburtttttttttttttttttttttttttttttttttttt")); // 69 key'ine sahip eleman oldugu için ekleme falan yapmaz.
        // 69 keyinin value'sunu return eder.
        System.out.println("Map: " + plakalar);

        // Belirtilen key değerini, belirtilen value ile günceller. (Put methodu ilede yapılabilirdi.)
        // Eğer key mevcut değilse null return eder. Key mevcut ise eski value değerini return eder.

        System.out.println(plakalar.replace(69, "Yeni Bayburt"));
        System.out.println(plakalar.replace(100, "Yeni Bayburt"));
        System.out.println("Map: " + plakalar);

        // Belirtilen key - oldValue değerine sahip öğeyi, newValue değeriyle günceller ve true return eder.
        // key-oldValue mevcut değilse false return eder.
        System.out.println(plakalar.replace(69, "Yeni BAybUrt", "Bayburt"));
        System.out.println(plakalar.replace(69, "Yeni Bayburt", "Bayburt"));
        System.out.println("Map: " + plakalar);

        // HashMap'in tüm value'larını -> işaretinin sağında kalan kısım şeklinde değiştirir.

        plakalar.remove(null);
        plakalar.remove(82);
        plakalar.replaceAll((key, value) -> value.toUpperCase());
        System.out.println(plakalar);

        HashMap<Integer, Integer> sayilar = new HashMap<>();
        sayilar.put(1, 1);
        sayilar.put(2, 2);
        sayilar.put(3, 3);
        sayilar.replaceAll((key, value) -> (key * key));
        System.out.println("Sayilar: " + sayilar);

        // Map üzerinde iterator kullanamayız ancak key değerleri veya value değerleri üzerinde kullanabiliri.z

        System.out.println("Plakalar: " + plakalar);

        Iterator<Integer> iterator = plakalar.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-------------");

        Iterator<String> iterator2 = plakalar.values().iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        Iterator<Map.Entry<Integer, String>> iterator3 = plakalar.entrySet().iterator();
        System.out.println("-------------");

        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

    }
}
