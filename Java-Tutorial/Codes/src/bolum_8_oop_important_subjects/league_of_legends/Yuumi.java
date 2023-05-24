package bolum_8_oop_important_subjects.league_of_legends;

public class Yuumi extends Destek{
    int nonPrivateVariable = 100;
    public Yuumi(String name, int can, int mana, int enerji, int destekGucu) {
        super("Yuumi", can, mana, enerji, destekGucu);
    }

    @Override
    public void hareketEt() {
        System.out.println("Yuumi baska bir sampiyonun icine girdi.");
    }


}
