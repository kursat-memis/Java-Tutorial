package bolum_8_oop_important_subjects;

public class inheritance {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(4, 5);
        System.out.println(dikdortgen);

        Kare kare = new Kare(4, 4);
        kare.cevreVeAlanYaz();
        kare.setEn(100);
        kare.setBoy(100);
        System.out.println(kare);
        kare.alanHesapla();
    }
}

class GeometrikSekil {
    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
        System.out.println("GeometrikSekil constructor'i calistirildi.");
    }

    public GeometrikSekil(int en) {
        this.en = en;
        System.out.println("GeometrikSekil constructor'i calistirildi.");
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void cevreHesapla() {
        System.out.println("Cevre: " + (en + boy) * 2);
    }

    public void alanHesapla() {
        System.out.println("Alan: " + (en * boy));
    }

    @Override
    public String toString() {
        return "GeometrikSekil{" +
                "en=" + en +
                ", boy=" + boy +
                '}';
    }
}

class Dikdortgen extends GeometrikSekil {

    public Dikdortgen(int en, int boy) {
        super(en, boy);
        System.out.println("Dikdortgen constructor'i calistirildi.");
    }

    public void cevreVeAlanYaz() {
        System.out.println("Cevre: " + 2 * (getEn() + getBoy()));
        System.out.println("Alan: " + getEn() * getBoy());
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "en=" + getEn() +
                ", boy=" + getBoy() +
                '}';
    }
}

class Kare extends Dikdortgen {

    public Kare(int en, int boy) {
        super(en, boy);
        System.out.println("Kare constructor'i calistirildi.");
    }

}