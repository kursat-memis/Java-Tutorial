package bolum_7_oop_introduction.homeworks;

public class Homework3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double total = calculator.plus(1, 2, 3, 4, 5, -1);
        total = calculator.minus(1, 2, 3, 4, 5);
        total = calculator.times(1, 2, 3, 4, 5);
        total = calculator.dividedBy(0, 100, 2, 5, 2, 5);
        System.out.println(total);
    }
}


class Calculator {
    int result = 0;

    public int plus(int... args) {
        for (int temp : args) {
            result += temp;
        }
        return result;
    }

    public int minus(int... args) {
        result = args[0];
        for (int i = 1; i < args.length; i++) {
            result -= args[i];
        }
        return result;
    }

    public int times(int... args) {
        result = 1;
        for (int temp : args) {
            result *= temp;
        }
        return result;
    }

    public double dividedBy(int... args) {
        result = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] == 0) return -1;
            result /= args[i];
        }
        return result;
    }

}