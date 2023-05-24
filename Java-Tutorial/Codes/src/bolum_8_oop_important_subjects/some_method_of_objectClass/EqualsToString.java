package bolum_8_oop_important_subjects.some_method_of_objectClass;

import java.util.Objects;

public class EqualsToString {
    public static void main(String[] args) {
        Person per1 = new Person("Kürşat", 1);
        Person per2 = new Person("Kürşat", 1);
        System.out.println(per1);
        System.out.println(per2);
        System.out.println("İki nesne eşit mi? " + per1.equals(per2));
        System.out.println("---------------------");

        String s1 = new String("Kürşat");
        String s2 = new String("Kürşat");
        System.out.println("İsimler eşit mi? " + s1.equals(s2));

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println("Sayılar eşit mi? " + i1.equals(i2));
        System.out.println("---------------------");

        Object obj = new Person("Kürşat", 1);
        System.out.println(per1.equals(obj));
        System.out.println(per1.equals((Person)obj));

    }
}


class Person extends Object {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Person o) {
        if (this == o) return true;
        return id == o.id && Objects.equals(name, o.name);
    }

    @Override
    public String toString() {
        return "id: " + id
                + " name: " + name;
    }
}