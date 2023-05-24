package bolum_8_oop_important_subjects.league_of_legends;

public class Destek extends Sampiyon{
    private int destekGucu;

    public Destek(String name, int can, int mana, int enerji, int destekGucu) {
        super(name, can, mana, enerji);
        this.destekGucu = destekGucu;
        System.out.println("Sampiyonun destek gucu: " + this.destekGucu);
    }

    public void canVer() {
        System.out.println("Sampiyon can veriyor.");
    }

    public void manaVer() {
        System.out.println("Sampiyon mana veriyor.");
    }

    public int getDestekGucu() {
        return destekGucu;
    }

    public void setDestekGucu(int destekGucu) {
        this.destekGucu = destekGucu;
    }

    @Override
    public String toString() {
        return super.toString() + "Destek{" +
                "destekGucu=" + destekGucu +
                '}';
    }
}
