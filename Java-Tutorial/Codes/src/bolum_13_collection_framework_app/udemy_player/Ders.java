package bolum_13_collection_framework_app.udemy_player;

public class Ders {
    private String dersAdi;
    private int dersSüresi;

    public Ders(String dersAdi, int toplamDakika) {
        this.dersAdi = dersAdi;
        this.dersSüresi = toplamDakika;
    }

    @Override
    public String toString() {
        return "{Ad: " + this.dersAdi + " || Süre: " + this.dersSüresi + " dk.}";
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public int getDersSüresi() {
        return dersSüresi;
    }

    public void setDersSüresi(int dersSüresi) {
        this.dersSüresi = dersSüresi;
    }
}
