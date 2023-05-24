package bolum_1_methods_arrays.methods;

public class Main {
    public static void main(String[] args) {

        // Pass By Value: Primitive type'lı variable'ları parametre olarak gönderirsek, methoda bu variable'ların kendileri değil kopyaları gönderilir.

        int number = 1;
        System.out.println("The value of the number in main: " + number);
        changeValue(number);
        System.out.println("The value of the number in main: " + number);

        // Method overloading: Aynı isimli methodun birden fazla kez tanımlanması demektir. Şart: Methodların imzası farklı olmalı.
        // Method imzası: Method adı + parametre sayısı + parametrelerin tipi
        f();
        f(3);
        f(3.2);
        f(3, 3.2);
    }

    private static void f() {
        System.out.println("Parametresiz f fonksiyonu.");
    }

    private static void f(int x) {
        System.out.println("Integer tanımlı tek parametreli f fonksiyonu.");
    }

    private static void f(double x) {
        System.out.println("Double tanımlı tek parametreli f fonksiyonu.");
    }

    private static void f(int x, double y) {
        System.out.println("İki parametreli f fonksiyonu.");
    }

    private static void changeValue(int number) {
        number = 100;
        System.out.println("The value of the number in method: " + number);
    }
}
