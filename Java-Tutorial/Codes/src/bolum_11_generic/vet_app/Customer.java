package bolum_11_generic.vet_app;

import java.util.ArrayList;

public class Customer extends Person{
    private ArrayList<Animal> animals;
    private int numberOfAnimals;

    public Customer(String name, String surname, int id, int phoneNumber) {
        super(name, surname, id, phoneNumber);
        animals = new ArrayList<>();
        numberOfAnimals = 0;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " adlı hayvan " + this.getName() + " adlı müşteriye eklendi.");
        numberOfAnimals++;
    }

    @Override
    public void showInfos() {
        System.out.println("****************************");
        System.out.println("Name - Surname: " + this.getName() + " - " + this.getSurname());
        System.out.println("Id: " + this.getId());
        System.out.println("Phone number: " + this.getPhoneNumber());
        System.out.println("Animals: ");
        for (int i = 0; i<numberOfAnimals; i++) {
            System.out.println(animals.get(i).getKind());
        }
        System.out.println("****************************");
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }
}
