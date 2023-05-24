package bolum_12_collection_framework._3_map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class _5TreeMapKullanimi {
    public static void main(String[] args) {
        TreeMap<String, Integer> people = new TreeMap<>();
        people.put("ceyhun", 3);
        people.put("ali", 1);
        people.put("baattin", 2);
        System.out.println(people);

        TreeMap<Book, Integer> books = new TreeMap<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.publicationYear < o2.publicationYear) return -1;
                else if (o1.publicationYear > o2.publicationYear) return 1;
                else return 0;
            }
        });
        books.put(new Book(2019, "C"), 3);
        books.put(new Book(2017, "A"), 1);
        books.put(new Book(2022, "B"), 2);

        System.out.println(books);

        // Dikkat: Hem comparator objesi parametre olarak verdildi hem de Book classı Comparable interface'ini implement etti. Çalışan method ise
        // Comparator objesindeki compare methodu oldu.

        TreeMap<Book, Integer> books2 = new TreeMap<>();
        books2.put(new Book(2019, "C"), 3);
        books2.put(new Book(2017, "A"), 1);
        books2.put(new Book(2022, "B"), 2);

    }
}

class Book implements Comparable<Book>{
    int publicationYear;
    String name;

    public Book(int publicationYear, String name) {
        this.publicationYear = publicationYear;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publicationYear=" + publicationYear +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        if (this.name.compareTo(o.name) > 0) return 1;
        else if (this.name.compareTo(o.name) < 0) return -1;
        else return 0;
    }
}

