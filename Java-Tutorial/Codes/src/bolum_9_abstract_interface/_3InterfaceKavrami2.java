package bolum_9_abstract_interface;

public class _3InterfaceKavrami2 {
    public static void main(String[] args) {
        InterfaceA.y(); // Interface içindeki static method sadece interface adıyla cagrilabilir, interface'i implement eden classlar üzeirnden cagrilamaz.

    }
}

abstract interface InterfaceA {
    public static final int x = 1;

    abstract void f();

    public static void y() {

    }

    public default void z() {

    }
}

interface InterfaceB {

}

interface InterfaceC extends InterfaceB, InterfaceA {

}

interface InnerInterface {

    interface Inner {

    }

}

abstract class A implements InterfaceA, InterfaceB {

}

class B extends A implements InnerInterface{

    @Override
    public void f() {

    }

    @Override
    public void z() {
        super.z();
    }
}

interface X {
    int x = 3;
}

class C implements X {
    void f() {
        System.out.println(x);
    }
}