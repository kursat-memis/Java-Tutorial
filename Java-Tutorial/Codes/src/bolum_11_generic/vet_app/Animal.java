package bolum_11_generic.vet_app;

abstract public class Animal {
    private String name, dateOfBirth, kind, healthProblem;

    public Animal(String name, String dateOfBirth, String healthProblem) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.healthProblem = healthProblem;
    }

    abstract public void showInfos();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHealthProblem() {
        return healthProblem;
    }

    public void setHealthProblem(String healthProblem) {
        this.healthProblem = healthProblem;
    }
}
