package bolum_8_oop_important_subjects.league_of_legends;

public class Tank extends Sampiyon{
    private int dayaniklikGucu;

    public void dayan() {
        System.out.println("Sampiyon gelen hasarlara dayanıyor.");
    }

    public Tank(String name, int can, int mana, int enerji, int dayaniklikGucu) {
        super(name, can, mana, enerji);
        this.dayaniklikGucu = dayaniklikGucu;
        System.out.println("Sampiyon dayaniklik gucu: " + this.dayaniklikGucu);
    }

    public void hasarlariAbsorbEt() {
        System.out.println("Gelen hasarlar absorbe ediliyor.");
    }

    public int getDayaniklikGucu() {
        return dayaniklikGucu;
    }

    public void setDayaniklikGucu(int dayaniklikGucu) {
        this.dayaniklikGucu = dayaniklikGucu;
    }
}
