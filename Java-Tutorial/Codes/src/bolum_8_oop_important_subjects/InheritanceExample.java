package bolum_8_oop_important_subjects;

public class InheritanceExample {
    public static void main(String[] args) {
        Kisi kisi = new Kisi("Kürşat", "Memiş", 1234, 23);

        MezunOgrenci mezunOgrenci = new MezunOgrenci("Habib", "Koçhan", 147896523, 23,
                10, 0, "KamuYonetimi", "Valilik", 2022);

        System.out.println(mezunOgrenci);

    }
}

class Kisi {
    private String name, surname;
    private long tcNo;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Kisi(String name, String surname, long tcNo, int age) {
        this.name = name;
        this.surname = surname;
        this.tcNo = tcNo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tcNo=" + tcNo +
                ", age=" + age +
                '}';
    }
}

class Personel extends Kisi {
    private double maas;
    private String pozisyon;

    public Personel(String name, String surname, long tcNo, int age, double maas, String pozisyon) {
        super(name, surname, tcNo, age);
        this.maas = maas;
        this.pozisyon = pozisyon;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }
}

class Ogrenci extends Kisi {
    private long ogrNo;
    private int sinif;
    private String brans;

    public Ogrenci(String name, String surname, long tcNo, int age, long ogrNo, int sinif, String brans) {
        super(name, surname, tcNo, age);
        this.ogrNo = ogrNo;
        this.sinif = sinif;
        this.brans = brans;
    }

    public long getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(long ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOgrenci{" +
                "ogrNo=" + ogrNo +
                ", sinif=" + sinif +
                ", brans='" + brans + '\'' +
                '}';
    }
}

class MezunOgrenci extends Ogrenci {
    private String calistigiSirket;
    private int mezunYili;

    public MezunOgrenci(String name, String surname, long tcNo, int age, long ogrNo,
                        int sinif, String brans, String calistigiSirket, int mezunYili) {
        super(name, surname, tcNo, age, ogrNo, sinif, brans);
        setBrans("Hukuk");
        setSinif(5);
        this.mezunYili = mezunYili;
        this.calistigiSirket = calistigiSirket;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMezunOgrenci{" +
                "calistigiSirket='" + calistigiSirket + '\'' +
                ", mezunYili=" + mezunYili +
                '}';
    }
}