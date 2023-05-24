package bolum_12_collection_framework._3_map_interface;

import java.util.Objects;

public class _1HashCodeKavrami {
    public static void main(String[] args) {
        // HashCode(): Objenin integer bir hash code'unu return eder.

        Student student1 = new Student(1, "Kürşat");
        Student student2 = new Student(1, "Kürşat");

        System.out.println("HashCode of Student1: " + student1.hashCode());
        System.out.println("HashCode of Student2: " + student2.hashCode());

        student1 = student2;

        System.out.println("HashCode of Student1: " + student1.hashCode());
        System.out.println("HashCode of Student2: " + student2.hashCode());

        /*
            Yukarıdaki objelerin hash code'ları ilk başta farklı çıkmasına rağmen, student1 = student2 atamasından sonra
            hash code'ları aynı çıkmaktadır.
            Sebebi: HashCode methodu, Student classı içerisinde override edilmediğinden dolayı Object classının içindeki hashCode()
            methodu calismaktadır. Object classı içindeki hashCode methodu, objeler aynı referansı gösterdiğinde aynı hashCode'ları üretir.
            Ancak objeler farklı referansları gösterdiğinde MUHTEMELEN aynı hash code'u üretmez.
            Muhtemelen diyoruz çünkü: farklı objelerin hash code'ları aynı çıkabilir.
            Yani; object classındaki hashcode methodu, aynı alanı referans eden objeler için aynı hash code'u üretirken
            farklı alanları referans eden objelerin hash code'larını aynı veya farklı üretebilir.
         */

        System.out.println("----------------------------------------------");

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        System.out.println("Hash code'lar eşit mi? " + (i1.hashCode() == i2.hashCode()));

        String s1 = new String("ali");
        String s2 = new String("ali");

        String _s1 = "ali";
        String _s2 = "ali";

        System.out.println("Hash code'lar eşit mi? " + (s1.hashCode() == s2.hashCode()));
        System.out.println("Hash code'lar eşit mi? " + (s1.hashCode() == _s2.hashCode()));

        /*
            Yukarıdaki objelerin hash code'ları biribiryle aynıdır.
            Çünkü: String ve Wrapper classlardaki hashCode methodları override edilmiştir.
            Ve bu method bu classlar içerisinde şu şekilde çalışır:
            - İki obje equals() methoduna göre eşitse hashCode'ları aynıdır.
            - İki obje equals() methoduna göre eşit değilse hashCode'ları MUHTEMELEN farklıdır ancak aynı da olabilir.
         */

        // Özetle söylemek gerekirse; Object, String ve Wrapper classlar için, equals() methoduna göre eşit olan objelerin,
        // hashcode'ları aynıdır. equals() methoduna göre eşit olmayan objelerin, hashcode'ları muhtemelen farklıdır ancak aynı da olabilir.

        System.out.println("----------------------------------------------------------------");

        Person p1 = new Person(1, "Kürşat");
        Person p2 = new Person(1, "Kürşat");

        System.out.println("Hashcode'lar eşit mi? " + (p1.hashCode() == p2.hashCode()));

        /*
            Yukarıdaki objelerin hashcode'ları aynı olarak üretilir.
            Çünkü: Person classı, Object classındaki hashCode methodunu override etmiştir.
            Ve Person Cllasındaki hashCode methoduna bakılırsa, objelerin id ve name alanlarına göre bir hash code üretimi yapıyor.
            İki objenin id ve name alanları aynı olduğu için hash code'ları aynı üretiliyor.

         */

        p2.id = 2;
        System.out.println("Hashcode'lar eşit mi? " + (p1.hashCode() == p2.hashCode()));
        // Burada false alırız çünkü p2 objesinin id değerini değiştirdik. Bu yüzden p2 objesinin hash code'u farklı üretilecek.
        // Ancak unutulmaması gereken husus farklı id değeride olsa yine aynı hash code üretilebilirdi. Bu hash code üretiminin nasıl gerçekleştirildiğine
        // bağlıdır.
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class Student {
    int id;
    String name;

    public Student (int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
