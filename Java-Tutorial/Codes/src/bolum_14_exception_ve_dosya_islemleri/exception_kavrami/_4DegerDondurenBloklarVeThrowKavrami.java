package bolum_14_exception_ve_dosya_islemleri.exception_kavrami;

public class _4DegerDondurenBloklarVeThrowKavrami {
    public static void main(String[] args) {
        System.out.println(selamla());

    }

    private static String selamla() {
        String selam = "Selam";

        try {
            selam = selam + " try";
           /* ArithmeticException arithmeticException = new ArithmeticException();
            throw arithmeticException;*/
            int x = 5 / 0;
            return selam;

        } catch (Exception e) {
            selam = selam + " catch";
            return selam;
        } finally {
            selam = selam + " finally.";
            return selam;
        }
    }

    private static String selamla2() {
        ArithmeticException exception = new ArithmeticException();
        throw exception;
        // methodun bir değeri return etmesine gerek yok çünkü excepiton fırlatılıyor.
    }
}
