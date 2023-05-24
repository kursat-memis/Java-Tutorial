package bolum_13_collection_framework_app.udemy_player;

import java.util.*;

public class Ogrenci extends Kisi {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Kurs> kursArrayList;
    private ArrayList<Ders> dersArrayList;


    public Ogrenci(String kullaniciAdi) {
        super(kullaniciAdi);
        kursArrayList = new ArrayList<>();
        dersArrayList = new ArrayList<>();
    }

    public void kursaKatil(Kurs kurs) {
        if (kurs.isAktifMi()) {
            kursArrayList.add(kurs);
            kurs.ogrenciEkle(this);
        } else {
            System.out.println("Kurs aktif değil.");
        }

    }

    public void listeyeDersEkle(Ders ders) {
        dersArrayList.add(ders);
    }

    public void listeyiGez() {
        if (dersArrayList.isEmpty()) {
            System.out.println("İzlenecek ders yok.");
        }
        ListIterator<Ders> iterator = dersArrayList.listIterator();
        System.out.println("1- Bir sonraki derse git.");
        System.out.println("2- Bir önceki derse git.");
        System.out.println("3- Çıkış");
        if (iterator.hasNext()) {
            System.out.println("Mevcut ders: " + iterator.next());
        } else {
            System.out.println("Liste boş.");
            return;
        }
        System.out.print("Secim: ");
        int secim;
        boolean flag = true;
        while ((secim = scanner.nextInt()) != 3) {
            switch (secim) {
                case 1:
                    flag = ilerlet(iterator, dersArrayList, flag);
                    break;
                case 2:
                    flag = gerilet(iterator, dersArrayList, flag);
                    break;
                case 3:
                    return;
            }
            System.out.print("Secim: ");
        }
        System.out.println("Dersleri gez uygulamasından çıkılıyor.");
    }

    private boolean gerilet(ListIterator<Ders> iterator, ArrayList<Ders> dersArrayList, boolean flag) {
        if (!iterator.hasPrevious()) {
            System.out.println("Geride eleman yok.");
            return flag;
        } else if (flag) {
            iterator.previous();
            if (iterator.hasPrevious()) {
                System.out.println("Yeni derse geçildi, mevcut ders: " + iterator.previous());
                return false;
            } else {
                System.out.println("Geride eleman yok.");
                iterator.next();
                return flag;
            }
        } else {
            System.out.println("Yeni derse geçildi, mevcut ders: " + iterator.previous());
            return false;
        }
    }

    private boolean ilerlet(ListIterator<Ders> iterator, ArrayList<Ders> dersArrayList, boolean flag) {
        if (!iterator.hasNext()) {
            System.out.println("İlerde eleman yok.");
            return flag;
        } else if (!flag) {
            iterator.next();
            System.out.println("Yeni derse geçildi, mevcut ders: " + iterator.next());
        } else {
            System.out.println("Yeni derse geçildi, mevcut ders: " + iterator.next());
            return true;
        }
        return true;
    }


    public ArrayList<Kurs> getKursArrayList() {
        return kursArrayList;
    }

    public void setKursArrayList(ArrayList<Kurs> kursArrayList) {
        this.kursArrayList = kursArrayList;
    }

    public ArrayList<Ders> getDersArrayList() {
        return dersArrayList;
    }

    public void setDersArrayList(ArrayList<Ders> dersArrayList) {
        this.dersArrayList = dersArrayList;
    }

    @Override
    public String toString() {
        return "{Kullanıcı Adı: " + getKullaniciAdi() + " || K.O.K.S: " + kursArrayList.size() + "}";
    }
}
