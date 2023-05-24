package bolum_7_oop_introduction.homeworks;

public class Homework1 {
    public static void main(String[] args) {
        CemberDaire cemberDaire = new CemberDaire(3);
        System.out.println("Cevre: " + cemberDaire.cevreHesapla());
        System.out.println("Alan: " + cemberDaire.alanHesapla());
    }
}

class CemberDaire {
    static double PI = 3.00;
    private int yaricap;

    public CemberDaire(int yaricap) {
        this.yaricap = yaricap;
    }

    public double cevreHesapla() {
        return 2 * PI * yaricap;
    }

    public double alanHesapla() {
        return PI * yaricap * yaricap;
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }
}