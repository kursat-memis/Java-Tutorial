package bolum_10_inner_classes;

public class LocalInnerClass {
    public int add(int number1, int number2) {
        int x = 1;
        class Add {
            int n1, n2;

            public Add(int n1, int n2) {
                this.n1 = n1;
                this.n2 = n2;
                System.out.println(x);
            }

            public int addNumbers() {
                return n1 + n2;
            }
        }
        Add add = new Add(number1, number2);
        return add.addNumbers();
    }
}
