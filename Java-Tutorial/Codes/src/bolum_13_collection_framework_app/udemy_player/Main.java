package bolum_13_collection_framework_app.udemy_player;

public class Main {
    public static void main(String[] args) {
        Egitmen egt1 = new Egitmen("polat_1");
        Egitmen egt2 = new Egitmen("memati_1");
        Egitmen egt3 = new Egitmen("erhan_1");

        System.out.println(egt1);

        Ogrenci ogr1 = new Ogrenci("kursat");
        Ogrenci ogr2 = new Ogrenci("habib");
        Ogrenci ogr3 = new Ogrenci("alperen");

        System.out.println(ogr1);

        Ders ders1 = new Ders("Java", 30);
        Ders ders2 = new Ders("JavaScript", 20);
        Ders ders3 = new Ders("Python", 15);
        Ders ders4 = new Ders("C", 25);
        Ders ders5 = new Ders("C++", 10);

        System.out.println(ders1);

        Kurs kurs1 = new Kurs("Yazılımcı Kursu");
        kurs1.dersEkle(ders1);
        kurs1.dersEkle(ders2);
        kurs1.dersEkle(ders3);
        kurs1.dersEkle(ders4);
        kurs1.dersEkle(ders5);
        kurs1.egitmenEkle(egt1);
        kurs1.egitmenEkle(egt2);
        kurs1.egitmenEkle(egt3);

        System.out.println(kurs1);

        egt1.kursEKle(kurs1);
        System.out.println(egt1);

        ogr1.kursaKatil(kurs1);
        System.out.println("Kurs1 deki ogrenciler: " + kurs1.getKayitliOgrenciler());
        System.out.println("Ogrencinin kayitli oldugu kurslar: " + ogr1.getKursArrayList());
        ogr1.listeyeDersEkle(ders1);
        ogr1.listeyeDersEkle(ders2);
        ogr1.listeyeDersEkle(ders3);

        System.out.println(ogr1.getDersArrayList());

        ogr1.listeyiGez();


    }
}
