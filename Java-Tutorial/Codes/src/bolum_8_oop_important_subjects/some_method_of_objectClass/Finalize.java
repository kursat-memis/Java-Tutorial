package bolum_8_oop_important_subjects.some_method_of_objectClass;

public class Finalize {
    public static void main(String[] args) {
        // Finalize Method: Nesne silinmeden önce tetiklenen method'dur.
        // Java 9'dan sonra kaldırılmıştır. Çünkü ne zaman çalışacağı belli değildir ve yazılımcıların
        // buna güvenmesi istenmemektedir.

        // Garbage Collector: Nesnenin artık kullanılmadığına ve silinmesi gerektiğine karar veren mekanizma.
        // Çok fazla çöp nesne birikmemişse çalışmaz, ne zaman calisacagi belli değildir.
        // System.gc(); komutu ile manuel olarak calistirabiliriz.

        A a = new A();
        for (int i = 0; i<100; i++) {
            if (i==90) {
                System.gc();
            }
            a = new A();
        }

    }
}

class A {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Carbage Collector calisti, nesne siliniyor.");
    }
}