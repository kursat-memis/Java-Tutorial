package bolum_11_generic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Muhammet", "Kürşat", "Ahmet"};
        Integer[] numbers = {1, 3, 5, 6};
        Character[] characters = {'a', 'b', 'c'};

        /*StringArrayPrint.print(names);
        IntegerArrayPrint.print(numbers);
        CharacterArrayPrint.print(characters);*/

        System.out.println("******************************");

        ObjectArrayPrint.print(names);
        ObjectArrayPrint.print(numbers);
        ObjectArrayPrint.print(characters);

        System.out.println("******************************");

        // Generic (jenerik): Genel.
        GenericArrayPrint<String> genericArrayPrint1 = new GenericArrayPrint<String>();
        genericArrayPrint1.print(names);

        GenericArrayPrint<Integer> genericArrayPrint2 = new GenericArrayPrint<>();
        genericArrayPrint2.print(numbers);

        GenericArrayPrint<Character> genericArrayPrint3 = new GenericArrayPrint<>();
        genericArrayPrint3.print(characters);

        GenericArrayPrint genericArrayPrint4 = new GenericArrayPrint(); // hiçbir şey yazılmazsa object tipindendir.
        genericArrayPrint4.print(names);
        genericArrayPrint4.print(numbers);

        System.out.println("******************************");

        // Generic Vs Object:

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Bayburt"); // length = 7
        cities.add("Bursa"); // length = 5
        cities.add("Aydın");
        cities.add("Manisa");
        // cities.add(4);
        cities.add("Balıkesir");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println("Length: " + cities.get(i).length());
        }

        ArrayList cities2 = new ArrayList();
        cities2.add("Bayburt"); // length = 7
        cities2.add("Bursa"); // length = 5
        cities2.add("Aydın");
        cities2.add("Manisa");
        cities2.add(4); // Burada run time exception atar. Eger object yerine generic type kullansaydım daha kodu yazarken java beni uyarırdı ve bu hataya düşmezdim.
        cities2.add("Balıkesir");

        /*for (int i = 0; i < cities2.size(); i++) {
            System.out.println("Length: " + ((String) (cities2.get(i))).length());
        }*/

        System.out.println("******************************");

        // Methodlarda Generic Kavrami:
        printArray(names);
        printArray(numbers);
        printArray(characters);

        //sadeceStringTiplileriYaz(numbers);
        sadeceStringTiplileriYaz(names);
    }

    public static <Type>void printArray(Type[] arr) {
        for(Type temp : arr) {
            System.out.println(temp);
        }
        System.out.println("-----------------------");
    }

    public static <Type extends String>void sadeceStringTiplileriYaz(Type[] arr) {
        for(Type temp : arr) {
            System.out.println("Value: " + temp + " Length: " + temp.length());
        }
        System.out.println("-----------------------");
    }
}
