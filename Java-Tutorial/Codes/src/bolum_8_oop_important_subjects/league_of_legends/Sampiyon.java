package bolum_8_oop_important_subjects.league_of_legends;

public class Sampiyon {
    private String name;
    private int can, mana, enerji;
    private static int sampiyonSayisi = 0;

    public Sampiyon() {
        System.out.println("Default Sampiyon olusturuldu.");
        sampiyonSayisi++;
    }

    public static void setSampiyonSayisi(int sampiyonSayisi) {
        Sampiyon.sampiyonSayisi = sampiyonSayisi;
    }

    public Sampiyon(String name, int can) {
        this.name = name;
        this.can = can;
        this.mana = 0;
        this.enerji = 0;
        sampiyonSayisi++;
        System.out.println("'" + name + "' adlı, '" + can + "' can degerine sahip sampiyon olusturuldu.");
    }

    public Sampiyon(String name, int can, int mana, int enerji) {
        this.name = name;
        this.can = can;
        this.mana = mana;
        this.enerji = enerji;
        sampiyonSayisi++;
        System.out.println("'" + name + "' adlı, '" + can + "' canlı, '" + mana + "' manalı ve '"
                + enerji + "' enerji degerine sahip sampiyon olusturuldu.");
    }

    @Override
    public String toString() {
        return "Sampiyon{" +
                "name='" + name + '\'' +
                ", can=" + can +
                ", mana=" + mana +
                ", enerji=" + enerji +
                '}';
    }

    public static int getSampiyonSayisi() {
        System.out.println("Sampiyon classındaki static method calisiyor.");
        return sampiyonSayisi;
    }

    public void hareketEt() {
        System.out.println("Sampiyon hareket ediyor.");
    }

    public void dur() {
        System.out.println("Sampiyon durdu.");
    }

    public void dansEt() {
        System.out.println("Sampiyon dans ediyor.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getEnerji() {
        return enerji;
    }

    public void setEnerji(int enerji) {
        this.enerji = enerji;
    }

}
