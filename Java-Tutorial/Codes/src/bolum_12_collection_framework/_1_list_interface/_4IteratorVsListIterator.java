package bolum_12_collection_framework._1_list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _4IteratorVsListIterator {
    public static void main(String[] args) {
        // Neden Iterator veya ListIterator'a ihtiyacımız var?
        ArrayList<Integer> numbers = new ArrayList<>();
        createArrayList(numbers, 5);

        // ArrayListteki elemanları sırayla okuyalım ve okuduğumuz elemanı listeden silelim.
        /*for (int i = 0; i<numbers.size(); i++) {
            System.out.println(i + ". indexteki eleman: " + numbers.get(i));
            numbers.remove(i);
        } // Okuduğu elemanı silen bir for döngüsü... (Beklediğimiz sonucu vermiyor.)
        System.out.println("Numbers: " + numbers);*/

        // ArrayList'de indexleri kullanarak eleman sildiğimizde vs. sağdaki elemanlar bir sola kayacağından dolayı indexler değişir.
        // İndexler değiştiği içinde index üzerinden bu elemanlara erişirken beklenmedik sonuçlar alırız.
        // Bu tür problemlerle karşılaşmamak için Iterator veya ListIterator kullansak iyi olur.

        // Yukarıda yapılmak istenen ama yapılamayan işlem iterator ile aşağıda sorunsuz bir şekilde yapılmıştır.
        /*Iterator iterator = numbers.iterator();
        int i = 0;
        while(iterator.hasNext()) {
            System.out.println(i + ". indexteki eleman: " + iterator.next());
            iterator.remove();
            i++;
        }
        System.out.println("Numbers: " + numbers);*/

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        // Iterator: Bir interface'dir. Iterable interface'inin içindeki methodun geri dönüş tipi Iterator'dır.

        Iterator<Integer> iterator = sayilar.iterator();

        // hasNext(): iterator, null'ı gostermediği sürece true return eder.
        System.out.println("Iterator'ın gösterdiği bir değer var mı? " + iterator.hasNext());

        // next(): Iterator'ın gösterdiği elementin üstünden geçer ve bunu return eder.
            // Eğer iterator null değeri gösterirken bu method calistirilirsa NoSuchElementException atar.4

        System.out.println(iterator.next()); // 1
        System.out.println(iterator.next()); // 2

        // remove(): next() methodunun geriye dönderdiği son elementi collection'dan siler. Eğer next() methodu cagrilmadan once remove() methodu cagrilirsa
                     // IllegalStateException hatası fırlatır.
                     // Her next methodundan sonra yalnızca bir kere remove() methodu cagrilabilir.


        System.out.println("Sayilar: " + sayilar);
        iterator.remove(); // next() methodunun son return ettiği değer 2 olduğu için, 2 elementini collection'dan siler.
        System.out.println("Sayilar: " + sayilar);
        // iterator.remove(); her next() methodundan sonra 1 kere remove() methodunu cagirabilirsin. Bu yüzden burada exception atar.

        // forEachRemaining(Cunsomer action): Parametre alan tek methoddur. Iterator Interface'i içinde default tanımlanarak içeriği doldurulmuştur.

        iterator = sayilar.iterator();
        iterator.forEachRemaining((sayi) -> System.out.println(sayi)); // iterator, collection'daki nesnelerin üzerinde sırayla gezer.
                                                                       // her gectiği nesneyi (sayi) değişkenine atar.
                                                                       // -> işaretinin sağında kalan işlemi yapar.
       // forEachRemaining methodunun arkaplanda calisma sekli:
       /*while(iterator.hasNext()) {
           Integer sayi = iterator.next();
           System.out.println(sayi);
       }*/

        // Not: Bir iterator oluşturulduğunda, bu iterator'ın next() methodu kullanılmadan önce, collection üzerinde bir değişiklik yapılırsa
        // iterator collection üzerinde yapacağı işlemleri doğru yapacağının garantisini veremeyeceğinden dolayı ConcurrentModificationException fırlatır.

        ArrayList<Integer> test = new ArrayList<>();
        Iterator<Integer> testIterator = test.iterator();
        test.add(1);
        // System.out.println(testIterator.); // hata fırlatır.

        System.out.println("--------------------------------------------------------------------------------------------");

        // ListIterator:
        // Iterator Interface'ini extends eden bir interface.

        ListIterator<Integer> listIterator = sayilar.listIterator();
        ListIterator<Integer> sondanBaslayanListIterator = sayilar.listIterator(sayilar.size()); // ListIterator sondan baslar.


        // hasNext(): ListIterator, null'ı gostermediği sürece true return eder.
        System.out.println("ListIterator'ın gösterdiği bir değer var mı? " + listIterator.hasNext());
        // hasPrevious(): ListIteratın öncesi, null'ı gostermediği sürece true return eder.
        System.out.println("ListIterator'ın arkasının gösterdiği bir değer var mı? " + sondanBaslayanListIterator.hasPrevious());

        // next(): ListIterator'ın gösterdiği elementin üstünden geçer ve bunu return eder.
        // Eğer iterator null değeri gösterirken bu method calistirilirsa NoSuchElementException atar.

        System.out.println(listIterator.next());

        // previous(): ListIterator'ın arkasının gösterdiği elementin üstünden geçer ve bunu return eder.
        // Eğer ListIterator'ın arkası null değeri gösterirken bu method calistirilirsa NoSuchElementException atar.

        System.out.println(sondanBaslayanListIterator.previous());

        // nextIndex(): next() methodu cagrildiğinda, ListIterator üstünden geçeceği elemanın indexini döner. ListIterator, listenin sonunda ise liste boyutunu dönderir.
        System.out.println("Sayilar: " + sayilar);
        listIterator = sayilar.listIterator();
        System.out.println(listIterator.nextIndex());
        listIterator.next();
        System.out.println(listIterator.nextIndex());
        listIterator.next();
        System.out.println(listIterator.nextIndex());
        listIterator.next();
        System.out.println(listIterator.nextIndex());
        listIterator.next();
        System.out.println(listIterator.nextIndex());
        System.out.println("------------------------");

        // previousIndex(): previous() methodu cagrildiğinda, ListIterator üstünden geçeceği elemanın indexini döner.
        // ListIterator, listenin basinda ise -1 dönderir.

        sondanBaslayanListIterator = sayilar.listIterator(sayilar.size());
        System.out.println(sondanBaslayanListIterator.previousIndex());
        sondanBaslayanListIterator.previous();
        System.out.println(sondanBaslayanListIterator.previousIndex());
        sondanBaslayanListIterator.previous();
        System.out.println(sondanBaslayanListIterator.previousIndex());
        sondanBaslayanListIterator.previous();
        System.out.println(sondanBaslayanListIterator.previousIndex());
        sondanBaslayanListIterator.previous();
        System.out.println(sondanBaslayanListIterator.previousIndex());
        System.out.println("------------------------");

        // remove(): next() / previous() methodunun geriye dönderdiği son elementi collection'dan siler. Eğer next()/previous() methodu cagrilmadan once remove()
        // methodu cagrilirsa IllegalStateException hatası fırlatır.
        // Her next()/remove() methodundan sonra yalnızca bir kere remove() methodu cagrilabilir.

        listIterator = sayilar.listIterator();
        listIterator.next();
        listIterator.remove(); // 1'i sildi.
        listIterator.next();
        listIterator.next();
        listIterator.remove(); // 4'ü sildi.
        listIterator.previous();
        listIterator.remove(); // 3'ü sildi
        System.out.println("Sayilar: " + sayilar);
        sayilar.clear();

        createArrayList(sayilar, 5);
        System.out.println("Sayilar: " + sayilar);

        // set(E e): next() veya previous() methodunun return ettiği son değeri günceller.
        // Bu method, add ve remove methodu cağrılmadığı sürece cağrılabilir.
        // Cünkü: Remove methodu next-previous methodunun return ettiği değeri siler. set methodu ise next-previous'un return ettiği değeri günceller.
        //        Silinen bir eleman güncellemeyeceğinden dolayı exception fırlatılır.

        listIterator = sayilar.listIterator();
        listIterator.next();
        listIterator.set(10); // ilk eleman yerine 10 set edildi.
        System.out.println("Sayilar: " + sayilar);
        listIterator = sayilar.listIterator(sayilar.size());
        listIterator.previous();
        listIterator.set(50); // son eleman yerine 50 set edildi.
        System.out.println("Sayilar: " + sayilar);

        // add(E e): Parametre olarak aldığı öğeyi, ListIterator'ın gösterdiği elemanın öncesine ekler.
        // ListIterator, ekleme olmadan önce gösterdiği elemanı göstermeye devam eder.
        // Eğer ListIterator, null değeri gsöterirken eleman eklenirse, eleman eklendikten sonra ListIterator, listenin sonuna gider ve null değeri göstermeye devam eder.
        // Yani eskiden null gösteriyordu, yine null göstermeye devam eder.
        sayilar.clear();
        createArrayList(sayilar, 5);
        System.out.println("Sayilar: " + sayilar);
        listIterator = sayilar.listIterator(sayilar.size());

        listIterator.add(100); // Listenin sonuna 100 eklendi.
        System.out.println("Sayilar: " + sayilar);
        System.out.println(listIterator.previous());
    }
    private static void createArrayList(ArrayList<Integer> numbers, int size) {
        for (int i = 1; i<=size; i++) {
            numbers.add(i);
        }
    }
}
