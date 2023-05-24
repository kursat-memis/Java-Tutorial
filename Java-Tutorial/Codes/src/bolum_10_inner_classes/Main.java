package bolum_10_inner_classes;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("----------------");

        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass();
        System.out.println(OuterClass.InnerClass.staticVarInner);
        System.out.println("------------------------------------");

        LocalInnerClass localInnerClass = new LocalInnerClass();
        int result = localInnerClass.add(1,2);
        System.out.println(result);

        System.out.println("----------------------------------");

        // Anonymous Inner Classes:
        Animal animal = new Animal();
        animal.tellMeYourName();

        Animal anonymousObject = new Animal(){
            @Override
            public void tellMeYourName() {
                System.out.println("I am Object of Anonymous Inner Class. (writes this for only this object)");
            }
        };

        anonymousObject.tellMeYourName();
        animal.tellMeYourName();

        AbstactClass abstactClass = new AbstactClass() {
            @Override
            public void f() {
                System.out.println("Anonim inner class.");
            }
        };
        abstactClass.f();

        InterfaceA interfaceA = new InterfaceA() {
            @Override
            public void f() {
                System.out.println("Anonim Inner Class.");
            }
        };
        interfaceA.f();
    }
}

class A {
    class B {
        class C {
            void methodC(){}
        }
    }
}

class Animal {

    public void tellMeYourName() {
        System.out.println("My name is Animal. (writes this for each animal object)");
    }

}

class fakeClass extends Animal { }

abstract class AbstactClass {
    abstract public void f();
}

interface InterfaceA {
    void f();
}