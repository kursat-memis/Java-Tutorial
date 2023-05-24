package bolum_7_oop_introduction;

public class StaticConcept {
    public static void main(String[] args) {
        Officer officer1 = new Officer(1, 1000);
        Officer officer2 = new Officer(2, 2000);
        Officer officer3 = new Officer(3, 3000);

        officer1.showInfos();
        officer2.showInfos();
        officer3.showInfos();
        System.out.println("Officer number: " + Officer.officerNumber);
        officer1.nonStaticMethod();

    }
}

class Officer {
    private double salary;
    private int no;
    static public int officerNumber;

    public Officer(int no, double salary) {
        this.no = no;
        this.salary = salary;
        officerNumber++;
    }

    public void showInfos() {
        System.out.println("Officer Number: " + this.officerNumber);
    }

    public static void staticMethod() {
        System.out.println("Static Method.");
        // nonStaticMethod();
    }

    public void nonStaticMethod() {
        System.out.println("Non-Static Method.");
        staticMethod();
    }

}