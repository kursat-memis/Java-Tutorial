package bolum_0_temeller;

public class _2VariableTypes {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("--------------");

        int aa = 1, bb, cc = 3;
        bb = 2;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);


        /*
            Variable Types:
            - There are 3 variable types in java.
            1. Local Variables
            2. Instance Variables
            3. Class/Static Variables
        */


        // Local Variables:
        // Methodlar ve bloklar içindeki variable'lardır.
        // Sadece tanımlandıkları blok içinde varolabilirler.
        // Acces modifiers kullanılmaz.
        // Default değerleri yoktur, o yüzden bir değer atanmak zorundadır.

        {
            int x = 10;
        }

        // System.out.println(x);

        // Instance Variables:
        // Class içinde tanımlanan değişkenlere denir. (Statik olmayan değişkenlere) (Bir method ve blok dışında tanımlanmış değişkenlere.)
        // Nesne oluşturulduğundan yok edilinceye kadar varlığını korurlar.



    }
}

class InstanceClassVariables {
    public static int y; // class variable || static variable.
    int x; // instance var.

    public void f() {
        int x; // local variable.
    }
}
