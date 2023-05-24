package bolum_8_oop_important_subjects;

public class StringImmutable {
    public static void main(String[] args) {
        // == operatoru değişkenlerin referanslarını kontrol eder.
        String s1 = new String("Ahmet");
        String s2 = new String("Ahmet");
        System.out.println("Referans kontrolu: " + (s1 == s2));

        // new keywordu kullanmayarak oluşturduğumuz String'ler, String Pool'da tutulur.
        String name = "Kürşat";
        name = "Memiş"; // Eski değerin üzerine yazmıyor, yeni bir alan oluşturup o alana yazıyor.
                        // name değişkeni artık yeni alanın adresini gösteriyor.
                        // Bu yüzden String Immutable'dır.

        String surname = "Memiş"; // String pool'da daha once bulunan memiş alanına ref edildi.
        System.out.println("Aynı alanı mı gösteriyorlar? " + (name == surname));

        // new ile oluşturulan String'ler String Pool'da tutulmaz.
        String name1 = new String("Ali");
        String name2 = new String("Ali");
        System.out.println(name1 == name2); // false
        System.out.println(name1.equals(name2)); // true
        System.out.println("----------------------------");

        // concat(): değişkene sondan ekleme yapar. (String pool'da degil, heapte.)
        String s = "Merhaba";
        String ss = s.concat("Dünya");
        System.out.println(ss);

        String sss = "MerhabaDünya";
        System.out.println("Ref'ler eşit mi? " + (ss == sss));

        // inter(): heap'teki Stringi, String pool'a taşıyor.

        String _string = new String("Merhaba");
        _string = _string.intern();
        String __string = "Merhaba";
        System.out.println(_string == __string);

    }
}

