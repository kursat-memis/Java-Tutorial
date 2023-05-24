package bolum_8_oop_important_subjects;

public class FinalKeyword {
    public static void main(String[] args) {
        final int finalVar = 10;
        // finalVar = 20;

    }
}

class ParentClass {
    final public void finalMethod() {
        System.out.println("Final Method.");
    }
}

class ChilClass extends ParentClass{
    public void f() {
        finalMethod();
    }

    /*final public void finalMethod() {
        System.out.println("Final Method.");
    }*/
}

final class FinalClass {

}

/*class Test extends FinalClass {

}*/

