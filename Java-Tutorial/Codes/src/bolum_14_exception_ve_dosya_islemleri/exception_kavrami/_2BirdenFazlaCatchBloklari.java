package bolum_14_exception_ve_dosya_islemleri.exception_kavrami;

public class _2BirdenFazlaCatchBloklari {
    public static void main(String[] args) {
        String[] array = {"abc", "123", null, "def"};

        for (int i = 0; i < array.length + 2; i++) {
            try {
                int sayi = array[i].length() + Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                System.out.println("Hata: " + e.toString());
            } catch (NullPointerException e) {
                System.out.println("Hata: " + e.toString());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Hata: " + e.toString());
            } finally {
                System.out.println((i) + " i değeri için finally.");
            }
        }
        System.out.println("------------------------------------------");

        for (int i = 0; i < array.length + 2; i++) {
            try {
                int sayi = array[i].length() + Integer.parseInt(array[i]);
            } catch (Exception e) {
                System.out.println("Hata: " + e.toString());
            }
        }
        System.out.println("------------------------------------------");

        for (int i = 0; i < array.length + 2; i++) {
            try {
                int sayi = array[i].length() + Integer.parseInt(array[i]);
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("NullPointer veya NumberFormat Hatası: " + e.toString());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexBoundsOfException Hatası: " + e.toString());
            } catch (Exception e) {
                System.out.println("Geriye kalan her türlü hata: " + e.toString());
            }
        }
        System.out.println("------------------------------------------");

        try {
            int[] arr = new int[3];
            arr[100] = 5/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
