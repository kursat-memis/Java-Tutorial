package bolum_8_oop_important_subjects;

public class Binding_Casting {
    public static void main(String[] args) {
        /*UstSinif.adiniSoyleStatic();
        AltSinif.adiniSoyleStatic();
        new UstSinif().adiniSoyleStatic();
        new AltSinif().adiniSoyleStatic();
        System.out.println("-----------------------------");

        UstSinif obj = new AltSinif();
        obj.adiniSoyleStatic();
        obj.adiniSoyle();
        System.out.println("-----------------------------");*/

        UstSinif nesne = new AltSinif();
        AltSinif nesne2 = (AltSinif) nesne; // kendi yaptığımız casting.

    }
}

class UstSinif {
    public static void adiniSoyleStatic() {
        System.out.println("UstSinif");
    }

    public void adiniSoyle() {
        System.out.println("UstSinif");
    }
}

class AltSinif extends UstSinif{

    /*public static void adiniSoyleStatic() {
        System.out.println("AltSinif");
    }*/

    public void adiniSoyle() {
        System.out.println("AltSinif");
    }

}