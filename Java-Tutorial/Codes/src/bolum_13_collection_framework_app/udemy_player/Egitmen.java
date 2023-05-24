package bolum_13_collection_framework_app.udemy_player;

import java.util.ArrayList;

public class Egitmen extends Kisi {
    private ArrayList<Kurs> kursArrayList;

    public Egitmen(String kullaniciAdi) {
        super(kullaniciAdi);
        kursArrayList = new ArrayList<Kurs>();
    }

    public void kursEKle(Kurs kurs) {
        kursArrayList.add(kurs);
    }

    public void kursSil(Kurs kurs) {
        if (kursArrayList.contains(kurs)) {
            kursArrayList.remove(kurs);
            System.out.println(this.getKullaniciAdi() + " eğitmenin verdiği kurslardan " + kurs.getAd() + " kursu çıkartıldı.");
        }
    }

    @Override
    public String toString() {
        return "{Kullanıcı Adı: " + this.getKullaniciAdi() + " || Kurs Sayisi: " + this.kursArrayList.size() + "}";
    }
}
