package bolum_9_abstract_interface;

public class _1AbstractClass {
    public static void main(String[] args) {
        Kare kare = new Kare(5);
        kare.cevreHesapla();
        kare.alanHesapla();
        System.out.println("Kare:");
        kare.bilgileriGoster();

        Dikdortgen dikdortgen = new Dikdortgen(4, 5);
        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();
        System.out.println("Dikdortgen:");
        dikdortgen.bilgileriGoster();

        Daire daire = new Daire(3);
        daire.cevreHesapla();
        daire.alanHesapla();
        System.out.println("Daire:");
        daire.bilgileriGoster();

        alanlariKiyasla(kare, dikdortgen);
        alanlariKiyasla(kare, daire);
        alanlariKiyasla(daire, dikdortgen);
    }

    public static void alanlariKiyasla(GeometrikSekil gs1, GeometrikSekil gs2) {
        if (gs1.getAlan() < gs2.getAlan()) {
            System.out.println(gs2.getAlan() + " alan degerine sahip " + gs2.getTip() + " alanı daha fazladır.");
        } else if (gs1.getAlan() > gs2.getAlan()) {
            System.out.println(gs1.getAlan() + " alan degerine sahip " + gs1.getTip() + " alanı daha fazladır.");
        } else {
            System.out.println("İki alan birbirine eşittir. Alan: " + gs1.getAlan());
        }
    }

}

abstract class GeometrikSekil {
    private int birinciKenar;
    private double alan, cevre;
    private String tip;

    public GeometrikSekil(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }

    abstract public void cevreHesapla();

    abstract public void alanHesapla();

    public void bilgileriGoster() {
        System.out.println("Cevre: " + cevre);
        System.out.println("Alan: " + alan);
    }

    public void setAlan(double alan) {
        this.alan = alan;
    }

    public void setCevre(double cevre) {
        this.cevre = cevre;
    }

    public double getAlan() {
        return alan;
    }

    public double getCevre() {
        return cevre;
    }

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

}

class Kare extends GeometrikSekil {

    {
        setTip("Kare");
    }

    public Kare(int birinciKenar) {
        super(birinciKenar);
    }

    @Override
    public void cevreHesapla() {
        setCevre(getBirinciKenar() * 4);
    }

    @Override
    public void alanHesapla() {
        setAlan(getBirinciKenar() * getBirinciKenar());
    }

}

class Dikdortgen extends GeometrikSekil {
    private int ikinciKenar;

    {
        setTip("Dikdortgen");
    }

    public Dikdortgen(int birinciKenar, int ikinciKenar) {
        super(birinciKenar);
        this.ikinciKenar = ikinciKenar;
    }

    @Override
    public void cevreHesapla() {
        setCevre((getBirinciKenar() + getIkinciKenar()) * 2);
    }

    @Override
    public void alanHesapla() {
        setAlan(getBirinciKenar() * getIkinciKenar());
    }

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }
}

class Daire extends GeometrikSekil {

    {
        setTip("Daire");
    }

    public Daire(int yaricap) {
        super(yaricap);
    }

    @Override
    public void cevreHesapla() {
        setCevre(2 * 3 * getBirinciKenar());
    }

    @Override
    public void alanHesapla() {
        setAlan(3 * getBirinciKenar() * getBirinciKenar());
    }
}

