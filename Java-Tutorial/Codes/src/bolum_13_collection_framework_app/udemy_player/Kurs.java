package bolum_13_collection_framework_app.udemy_player;

import java.util.ArrayList;
import java.util.Iterator;

public class Kurs {
    private String ad;
    private ArrayList<Ders> dersler;
    private ArrayList<Egitmen> egitmenler;
    private ArrayList<Ogrenci> kayitliOgrenciler;
    private int toplamDakika;
    private boolean aktifMi;

    public Kurs(String ad) {
        this.ad = ad;
        this.dersler = new ArrayList<>();
        this.egitmenler = new ArrayList<>();
        this.kayitliOgrenciler = new ArrayList<>();
        this.toplamDakika = hesaplaToplamDakika();
        this.aktifMi = (dersler.size() >= 5 && toplamDakika > 60);
    }

    public void egitmenEkle(Egitmen egitmen) {
        egitmenler.add(egitmen);
    }

    public void dersEkle(Ders ders) {
        toplamDakika += ders.getDersSüresi();
        dersler.add(ders);
        if (!aktifMi && toplamDakika > 60 && dersler.size() >= 5) aktifMi = true;
    }

    public void ogrenciEkle(Ogrenci ogrenci) {
        kayitliOgrenciler.add(ogrenci);
    }

    private int hesaplaToplamDakika() {
        Iterator<Ders> iterator = dersler.iterator();
        int dakika = 0;
        while (iterator.hasNext()) {
            dakika += iterator.next().getDersSüresi();
        }
        return dakika;
    }

    @Override
    public String toString() {
        return "{Egitmen Sayisi: " + egitmenler.size() + " || Ders Sayisi: " + dersler.size() + " || " + "KOS: " + kayitliOgrenciler.size()
                + " || Kurs Uzunluğu: " + toplamDakika + " || AktifMi? " + aktifMi + "}";
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public ArrayList<Ders> getDersler() {
        return dersler;
    }

    public void setDersler(ArrayList<Ders> dersler) {
        this.dersler = dersler;
    }

    public ArrayList<Egitmen> getEgitmenler() {
        return egitmenler;
    }

    public void setEgitmenler(ArrayList<Egitmen> egitmenler) {
        this.egitmenler = egitmenler;
    }

    public ArrayList<Ogrenci> getKayitliOgrenciler() {
        return kayitliOgrenciler;
    }

    public void setKayitliOgrenciler(ArrayList<Ogrenci> kayitliOgrenciler) {
        this.kayitliOgrenciler = kayitliOgrenciler;
    }

    public int getToplamDakika() {
        return toplamDakika;
    }

    public void setToplamDakika(int toplamDakika) {
        this.toplamDakika = toplamDakika;
    }

    public boolean isAktifMi() {
        return aktifMi;
    }

    public void setAktifMi(boolean aktifMi) {
        this.aktifMi = aktifMi;
    }
}
