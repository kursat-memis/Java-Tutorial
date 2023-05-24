package bolum_13_collection_framework_app.udemy_player;

public abstract class Kisi {
    private String kullaniciAdi;

    public Kisi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    @Override
    abstract public String toString();

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
}

