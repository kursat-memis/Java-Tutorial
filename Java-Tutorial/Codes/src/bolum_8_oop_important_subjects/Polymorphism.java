package bolum_8_oop_important_subjects;

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("Golden");
        Cat cat = new Cat("Van");

        adiniSoyle(animal);
        adiniSoyle(dog);
        adiniSoyle(cat);

    }

    public static void adiniSoyle(Animal animal) {
        System.out.println(animal);
    }

}


class Animal {
    private int ayakSayisi;

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    @Override
    public String toString() {
        return "Ben bir Animal nesnesiyim.";
    }
}

class Dog extends Animal {
    private String tur;

    public Dog(String tur) {
        this.tur = tur;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        return "Ben bir Dog nesnesiyim.";
    }
}

class Cat extends Animal {
    private String cins;

    public Cat(String cins) {
        this.cins = cins;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    public String toString() {
        return "Ben bir Cat nesnesiyim.";
    }
}
