package bolum_9_abstract_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _5ComparableVsComparator {
    public static void main(String[] args) {
        Book b1 = new Book("C", "Ali", 40, 1999);
        Book b2 = new Book("A", "Batuhan", 52, 1980);
        Book b3 = new Book("Z", "Safak", 55, 2002);
        Book b4 = new Book("D", "Caner", 47, 2017);
        Book b5 = new Book("B", "Kardelen", 55, 1995);
        Book b6 = new Book("B", "Ali", 55, 1995);
        Book b7 = new Book("C", "Caner", 25, 1995);

        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);

        System.out.println("Books: " + books);
        System.out.println("------------------------------------");

        Collections.sort(books);
        System.out.println("Books: " + books);

        /*
            Comparable interface'inden gelen compareTo methodunun içi bir kere tanımlanır.
            Bundan sonra biz elemanlarımızı sıralamak istediğimizde compareTo methodunun içinde belirttiğimiz alanlar üzerinden bir sıralama yapılır.
            Ancak programın farklı yerlerinde farklı alanlara göre sıralama yapmak istediğimizde naparız?
            - Mesela 100. satırda price alanına göre sıralama yapmak istiyorum ancak 200. satırda price ve publicationYear alanına göre
            ve 400. satırda da name ve author alanına göre sıralama yapmak istiyorum.
            - compareTo methodunu overload etmek akla gelebilir ancak overload ederken bu methodun parametresini değiştirmek için fazla bir şansımız olmuyor.
              (Yapsan yapsan parametreyi object yaparsın ve 2 methoda sahip olmuş olursun.)
            - İşte buda bizi kurtarmıyor.
            - E ne yapacağız? Cevap: Comparator interface'ini kullanmak.
         */

        Collections.sort(books, new SortByName());
        System.out.println("Isme göre sıralandı: " + books);
        Collections.sort(books, new SortByNameAndPrice());
        System.out.println("Isme ve fiyata göre sıralandı: " + books);
        Collections.sort(books, new SortByPublicationYear());
        System.out.println("Yayımlanma yılına göre sıralandı: " + books);

        // Not: Comparator parametresine gönderdiğimiz argüman için anonymous inner classlarıda kullanabiliriz.
        // Eğer o tip sıralama sadece burada kullanılacak ve bir daha kullanılmicaksa anonim inner class kullan.
        // Eğer o tip sıralama birden fazla kullanılacaksa ayrı bir class oluştur ve o class Comparator interface'ini implement etsin ve onun objesini kullan.

        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int priceCompare, publicationYearCompare;
                if (o1.price < o2.price) priceCompare = -1;
                else if (o1.price > o2.price) priceCompare = 1;
                else priceCompare = 0;

                if (o1.publicationYear < o2.publicationYear) publicationYearCompare = -1;
                else if (o1.publicationYear > o2.publicationYear) publicationYearCompare = 1;
                else publicationYearCompare = 0;

                int result = (priceCompare == 0) ? publicationYearCompare : priceCompare;
                return result;

            }
        }); // Fiyata ve basım yılına göre.
        System.out.println("Fiyata ve basım yılına göre: " + books);

    }
}

class Book implements Comparable<Book>{
    String name, author;
    int price, publicationYear; // basım yılı.

    public Book(String name, String author, int price, int publicationYear) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + author + ", " + price + ", " + publicationYear + "}";
    }


    @Override
    public int compareTo(Book o) { // öncelik isme göre ancak isimler aynıysa fiyata göre.
        int  nameCompare;
        int priceCompare;

        nameCompare = this.name.compareTo(o.name);
        if (this.price < o.price) priceCompare = -1;
        else if (this.price > o.price) priceCompare = 1;
        else priceCompare = 0;

        int result = (nameCompare==0) ? priceCompare : nameCompare;
        return result;
    }
}

class SortByName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortByNameAndPrice implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int  nameCompare;
        int priceCompare;

        nameCompare = o1.name.compareTo(o2.name);
        if (o1.price < o2.price) priceCompare = -1;
        else if (o1.price > o2.price) priceCompare = 1;
        else priceCompare = 0;

        int result = nameCompare==0 ? priceCompare : nameCompare;
        return result;
    }
}

class SortByPublicationYear implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.publicationYear < o2.publicationYear) return -1;
        else if(o1.publicationYear > o2.publicationYear) return 1;
        else return 0;
    }
}