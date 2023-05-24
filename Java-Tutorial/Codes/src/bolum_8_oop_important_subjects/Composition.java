package bolum_8_oop_important_subjects;

public class Composition {
    public static void main(String[] args) {
        Araba myCar = new Araba(new Motor(1990, "Honda"), "Siyah", "Renault");
        myCar.calistir();
        myCar.dur();
    }
}

class Motor {
    private int beygirGucu;
    private String uretici;

    public Motor(int beygirGucu, String uretici) {
        this.beygirGucu = beygirGucu;
        this.uretici = uretici;
        System.out.println("Motor üretildi.");
    }

    public void calistir() {
        System.out.println("Motor calisti.");
    }

    public void dur() {
        System.out.println("Motor durdu.");
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
}

class Araba {
    private Motor motor;
    private String renk;
    private String uretici;

    public Araba(Motor motor, String renk, String uretici) {
        this.motor = motor;
        this.renk = renk;
        this.uretici = uretici;
        System.out.println("Araba üretildi.");
    }

    public void calistir() {
        motor.calistir();
        System.out.println("Araba calisti.");
    }

    public void dur() {
        motor.dur();
        System.out.println("Araba durdu.");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
}