package bolum_14_exception_ve_dosya_islemleri.exception_kavrami;

public class _3MethodIcindekiTryCatchVeIcIceTryCatch {
    public static void main(String[] args) {
        String[] array = {"abc", "123", null, "def"};

        for (int i = 0; i < array.length + 2; i++) {
            try {
                int sayi = array[i].length();
                try {
                    sayi = Integer.parseInt(array[i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Hata1: " + e.toString() + " forrrrrrr " + array[i]);
                }
            } catch (NullPointerException e) {
                System.out.println("Hata2: " + e.toString() + " forrrrrrr " + array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Hata3: " + e.toString());
            } catch (Exception e) {
                System.out.println("Hata4: " + e.toString());
            }
        }
        System.out.println("---------------------------");

        try {
            hataUret();
        } catch (ArithmeticException e) {
            System.out.println("Hata: " + e.toString());
        }
        System.out.println("---------------------------");

        // Eğer içteki try blogunda cıkan hata, içteki catch tarafından yakalanmazsa dıştaki catch blogunda yakalanmaya calisir.

        try {
            try {
                throw new RuntimeException();
            } catch (NullPointerException e) {
                System.out.println("İçteki.");
            }
        } catch (RuntimeException e) {
            System.out.println("Dıştaki.");
        }

    }
    public static void hataUret(){
        String[] array = {"abc", "123", null, "def"};
        for (int i = 0; i<10; i++) {
            System.out.println("i degeri " + i + " için çalışıyor.");
            try {
                if (i == 3) {
                    i = 5/0;
                }
            } catch (NumberFormatException e) {
                System.out.println("Hata: " + e.toString());
            }
            try {
                int x = Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                System.out.println("Hata: " + e.toString());
            }
        }
    }
}
