package bolum_9_abstract_interface;

public class _2InterfaceKavrami {
    public static void main(String[] args) {
        SarkiciOzellikeri sarkiciOzellikeri = new TugceKandemir();
        sarkiciOzellikeri.sarkiSoyle();
        ((TugceKandemir)sarkiciOzellikeri).dansEt();
        ((TugceKandemir)sarkiciOzellikeri).sigaraIc();
        TugceKandemir tugceKandemir = new TugceKandemir();
    }
}

interface Insan {
    void yemekYe();
    void suIc();
}

interface SarkiciOzellikeri {
    void sarkiSoyle();
}

interface PopSarkiciOzellikleri extends SarkiciOzellikeri, Insan{
    void dansEt();
}

interface ArabeskSarkiciOzellikleri extends SarkiciOzellikeri, Insan {
    void sigaraIc();
}

class TugceKandemir implements PopSarkiciOzellikleri, ArabeskSarkiciOzellikleri {

    @Override
    public void sarkiSoyle() {
        System.out.println("Tugce Kandemir sarki soyluyor.");
    }

    @Override
    public void dansEt() {
        System.out.println("Tugce Kandemir dans ediyor.");
    }

    @Override
    public void sigaraIc() {
        System.out.println("Tugce Kandemir sahnede sigara içiyor.");
    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void suIc() {

    }
}

/* abstract class SarkiciOzellikleri {
    abstract public void sarkiSoyle();
}

abstract class PopSarkicisiOzellikleri extends SarkiciOzellikleri{
    public void dansEt() {
        System.out.println("Sahnede dans ediliyor.");
    }
}

abstract class ArabestSarkicisiOzellikleri extends SarkiciOzellikleri {
    public void sigaraIc() {
        System.out.println("Sahnede sigara icilir.");
    }
}

class TugceKandemir extends PopSarkicisiOzellikleri, ArabestSarkicisiOzellikleri{

}*/

