package bolum_11_generic.vet_app;

public class Cat extends Animal{
    private String genus;
    private boolean isFip;

    public Cat(String name, String dateOfBirth, String healthProblem, String genus, boolean isFip) {
        super(name, dateOfBirth, healthProblem);
        this.genus = genus;
        setKind("Cat");
        this.isFip = isFip;
    }

    @Override
    public void showInfos() {
        System.out.println("----------------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("Kind: " + this.getKind());
        System.out.println("Genus: " + this.genus);
        System.out.println("Date of Birth: " + this.getDateOfBirth());
        System.out.println("Health Problem: " + this.getHealthProblem());
        System.out.println("Fip status: " + this.isFip);
        System.out.println("----------------------------");
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public boolean isFip() {
        return isFip;
    }

    public void setFip(boolean fip) {
        isFip = fip;
    }
}
