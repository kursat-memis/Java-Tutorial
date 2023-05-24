package bolum_10_inner_classes;

public class StaticInnerClasses {
    public static void main(String[] args) {
        DısClass.IcClass obj = new DısClass.IcClass();
        obj.nonStaticMethod();
        DısClass.IcClass.staticMethod();
    }
}

class DısClass {
    static int staticVar = 1;
    int nonStaticVar = 2;


    static class IcClass {

        public void nonStaticMethod() {
            // System.out.println(nonStaticVar);
        }

        static public void staticMethod() {

        }

    }

}