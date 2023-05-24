package bolum_12_collection_framework._3_map_interface;

import java.util.HashMap;
import java.util.Objects;

public class _3HashMapCalismaMantigi {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<>(); // Arka planda 16 boyutlu bir array oluştu. (Her indexe karşılık gelen kutulara bucket(kova) deniyor.)

        /*
            HashMap'e eleman ekleme:
            1. Eklenecek entry'nin Key değerinin int bir hash code'u bulunur. (key değerinin üretildiği classdaki hashcode() methodu ile.)
            2. Bu hash code değeri, 0-15 arasında bir indexe karşılık gelecek şekilde işeleme tutulur.
            3. Arka plandaki Array'de bulunan index'e karşılık gelen bucket'a gidilir.
            4. Bucket'ın bir node'u gösterip göstermediği kontrol edilir.
            5. Eğer göstediği bir node yoksa; içinde Int hash, K key, V value, Node next field'ları bulunan yeni bir node oluşturulur.
               -> Eklenecek entry'nin hash değeri node'un hash değerine, key değeri node'un key değerine, value değeri node'un value değerine atanır ve node'un next değeri null atanır.
               -> Bucket, artık bu yeni oluşan node'u point eder.
               Eğer gösterdiği bir node varsa; eklenecek entry'nin hash code'u ve bucket'ın gösterdiği node'un hash field'ı kıyaslanır.
               -> Hash'ler farklı çıkarsa bir sonraki node'a geçilir ve bu node'un hash değeriyle entry'nin hash code değeri kıyaslanır. Bucket üzerindeki LinkedList'e eleman
                  kalmayana kadar hash değerleri eşleşmezse eklenmek istenen entry'i temsil edecek yeni bir node oluşturulur ve bucket üzerindeki LinkedList'e son eleman olarak
                  eklenir.
               -> Eğer hash'ler aynı çıkarsa entry'nin key değeri ve node'un key field'ı equals methoduna göre kıyaslanır.
               -> Equals methodu true return ederse key'lerin aynı olduğu anlaşılır ve entry'nin value değeri bu node'un value değerine atanır.
               -> Equals methodu false return ederse key'lerin farklı olduğu anlaşılır ve bir sonraki node'a geçilir. Bucket üzerinde eleman kalmayana dek bu işlem devam eder.
               -> LinkedList'e gezilecek eleman kalmadığında entry'i temsil eden bir node oluşturulur ve LinkedList'in sonuna bağlanır.

            Not: Key değeri null olan elemanlar, arka plandaki Array'in 0. indexine karşılık gelen bucket'a bağlanır.
         */

        Key key1 = new Key(1);
        Key key2 = new Key(1);

        hashMap.put(key1, "Bir");
        hashMap.put(key2, "Iki");
        System.out.println(hashMap);

        /*
            HashMap'de eleman arama::
            1. Ilgili methoda gönderilen key değerinin hash code'u hesaplanır.
            2. Bu hash code değeri, 0-15 arasında bir indexe karşılık gelecek şekilde işleme tutulur.
            3. Arka plandaki Array'de bulunan index'e karşılık gelen bucket'a gidilir.
            4. Bucket'ın bir node'u gösterip göstermediği kontrol edilir.
            5. Eğer gösterilen bir node yoksa, eleman bulunamaz.
               Eğer gösterilen bir node varsa, bu node'un hash değeriyle aranan key değerinin hash code'u kıyaslanır.
               Hash'ler aynıysa key değerleri equals() methoduna göre kıyas edilir. Equals, true return ederse eleman bulunmuştur.
               Hash'ler farklıysa bir sonraki node'a geçilir. Ve LinkedList'e eleman kalmayana kadar bu işlem tekrar edilir.
         */

        System.out.println(hashMap.containsKey(new Key(1)));

        /*
            HashMap'den eleman kaldırma::
            1. Ilgili methoda gönderilen key değerinin hash code'u hesaplanır.
            2. Bu hash code değeri, 0-15 arasında bir indexe karşılık gelecek şekilde işleme tutulur.
            3. Arka plandaki Array'de bulunan index'e karşılık gelen bucket'a gidilir.
            4. Bucket'ın bir node'u gösterip göstermediği kontrol edilir.
            5. Eğer gösterilen bir node yoksa, eleman bulunamaz.
               Eğer gösterilen bir node varsa, bu node'un hash değeriyle aranan key değerinin hash code'u kıyaslanır.
               Hash'ler aynıysa key değerleri equals() methoduna göre kıyas edilir. Equals, true return ederse eleman bulunmuştur. Bu node LinkedList çıkarılır.
               Hash'ler farklıysa bir sonraki node'a geçilir. Ve LinkedList'e eleman kalmayana kadar bu işlem tekrar edilir.
         */

        // Not: Load factor varsayılan olarak 0.75'dir. Arka plandaki dizinin boyutuda varsayılan olarak 16'dır.
        // 16*0.75 = 12.
        // Yani: 12. eleman eklendikten sonra arkaplandaki dizinin boyutu 2 katına çıkar ve yeniden hashing işlemi gerçekleşir.

        // Not: Java 8'den sonra gelen bir güncellemeyle, bir bucket içerisinde en az 8 node tutultuğu taktirde o bucket'daki elemanlar artık LinkedList şeklinde
        // tutulmak yerine kendini dengeleyen ağaç yapısıyla tutulur. (Selfing Balanced Tree.) Bu sayede o bucket'a eleman arama işlemi O(N) yerine O(logn) olmuş olur.
    }
}

class Key {
    int key;

    public Key(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Key{" +
                "key=" + key +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        return this.key == ((Key) o).key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
