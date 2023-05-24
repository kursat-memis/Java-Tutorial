package bolum_11_generic.vet_app;

public class Dog extends Animal {
    private boolean isKuduz;
    private String genus; // cins

    public Dog(String name, String dateOfBirth, String healthProblem, boolean isKuduz, String genus) {
        super(name, dateOfBirth, healthProblem);
        setKind("Dog");
        this.genus = genus;
        this.isKuduz = isKuduz;
    }

    @Override
    public void showInfos() {
        System.out.println("----------------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("Kind: " + this.getKind());
        System.out.println("Genus: " + this.genus);
        System.out.println("Date of Birth: " + this.getDateOfBirth());
        System.out.println("Health Problem: " + this.getHealthProblem());
        System.out.println("Kuduzluk status: " + this.isKuduz);
        System.out.println("----------------------------");
    }

    public boolean isKuduz() {
        return isKuduz;
    }

    public void setKuduz(boolean kuduz) {
        isKuduz = kuduz;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }
}
