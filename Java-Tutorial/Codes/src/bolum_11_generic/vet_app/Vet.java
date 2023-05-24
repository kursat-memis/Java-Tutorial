package bolum_11_generic.vet_app;

import java.util.ArrayList;

public class Vet extends Person {
    private String city;
    private int numberOfCustomers;
    private ArrayList<Customer> customers;

    public Vet(String name, String surname, int id, int phoneNumber, String city) {
        super(name, surname, id, phoneNumber);
        this.city = city;
        customers = new ArrayList<>();
        numberOfCustomers = 0;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getName() + " adli müşteri eklendi.");
        numberOfCustomers++;
    }

    @Override
    public void showInfos() {
        System.out.println("****************************");
        System.out.println("Name - Surname: " + this.getName() + " - " + this.getSurname());
        System.out.println("Id: " + this.getId());
        System.out.println("Phone number: " + this.getPhoneNumber());
        System.out.println("City: " + this.city);
        System.out.println("Animals: ");
        for (int i = 0; i<numberOfCustomers; i++) {
            System.out.println(customers.get(i).getName());
        }
        System.out.println("****************************");
    }
}
