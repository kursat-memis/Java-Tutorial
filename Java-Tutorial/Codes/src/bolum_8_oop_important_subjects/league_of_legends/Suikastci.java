package bolum_8_oop_important_subjects.league_of_legends;

public class Suikastci extends Sampiyon{
    private int suikastGucu;

    public Suikastci(String name, int can, int mana, int enerji, int suikastGucu) {
        super(name, can, mana, enerji);
        this.suikastGucu = suikastGucu;
        System.out.println("Sampiyonun suikast gücü: " + this.suikastGucu);
    }

    public void calidaSaklan() {
        System.out.println("Suikastci calida saklaniyor.");
    }

    public void suikastYap() {
        System.out.println("Suikastci suikast yapiyor.");
    }

    public int getSuikastGucu() {
        return suikastGucu;
    }

    public void setSuikastGucu(int suikastGucu) {
        this.suikastGucu = suikastGucu;
    }
}
