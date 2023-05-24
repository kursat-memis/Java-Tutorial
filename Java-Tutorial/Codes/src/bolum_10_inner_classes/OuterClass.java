package bolum_10_inner_classes;

public class OuterClass {

    static {
        System.out.println("Static blok of outer class.");
    }

    {
        System.out.println("Instance blok of outer class.");
    }

    public OuterClass() {
        System.out.println("Constructor of Outer class.");
    }

    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;

    private void privateMethod(){}
    void defaultMethod(){}
    protected void protectedMethod(){}
    public void publicMethod(){}

    public void print() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.privateVarInner);
        innerClass.privateMethodInner();
    } // Outer classtan, iç sınıfın bütün alanlarına erişebilirsin. Ancak inner sınıfın bir nesnesini oluşturman gerekiyor.

    class InnerClass {
        static {
            System.out.println("Static blok of inner class.");
        }

        {
            System.out.println("Instance blok of inner class.");
        }

        public InnerClass() {
            System.out.println("Constructor of Inner class.");
        }

        private int privateVarInner = 1;
        int defaultVarInner = 2;
        protected int protectedVarInner = 3;
        public int publicVarInner = 4;
        static int staticVarInner = 5;

        private void privateMethodInner(){}
        void defaultMethodInner(){}
        protected void protectedMethodInner(){}
        public void publicMethodInner(){}

        public void printInner() {
            System.out.println(privateVar);
            privateMethod();
        } // inner class içinden, dış sınıfın bütün alanlarına erişebilirsin.
    }

}
