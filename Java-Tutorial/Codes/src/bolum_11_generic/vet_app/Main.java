package bolum_11_generic.vet_app;

public class Main {
    public static void main(String[] args) {
        createdObjects();
    }

    private static void createdObjects() {
        Dog dog1 = new Dog("Karabas", "01.01.2016", "Diş eksikliği", false, "Doberman");
        Dog dog2 = new Dog("Fox", "03.03.2018", "Tüy döküyor", true, "Pitbull");
        Dog dog3 = new Dog("Zeytin", "10.10.2016", "Çok havlıyor", false, "Sokak Köpeği");
        Dog dog4 = new Dog("Paskal", "03.03.2022", "İşitme", false, "Kangal");
        Cat cat1 = new Cat("Minnos", "02.02.2017", "Pati kırık", "Tekir", true);
        Cat cat2 = new Cat("Tom", "04.04.2019", "Yaramaz", "Sokak Kedisi", false);
        Cat cat3 = new Cat("Boncuk", "03.02.1999", "Göz Problemi", "Bengal", false);
        Cat cat4 = new Cat("Garfield", "12.04.2022", "Uykucu", "Van", true);

        Customer customer1 = new Customer("Kürşat", "Memiş", 1, 123);
        Customer customer2 = new Customer("Habib", "Kochan", 2, 456);
        Customer customer3 = new Customer("Şefik", "Süslü", 3, 789);

        customer1.addAnimal(dog1);
        customer1.addAnimal(cat1);
        customer2.addAnimal(dog2);
        customer2.addAnimal(cat2);
        customer3.addAnimal(dog3);
        customer3.addAnimal(cat3);

        Vet vet1 = new Vet("Basak","Arık", 1, 123444, "Bayburt");
        Vet vet2 = new Vet("Hakan", "Erdenet", 123123, 213123213, "Ankara");
        vet1.addCustomer(customer1);
        vet1.addCustomer(customer2);
        vet2.addCustomer(customer3);

        customer1.showInfos();
        customer2.showInfos();
        customer3.showInfos();

        vet1.showInfos();
        vet2.showInfos();

    }
}
